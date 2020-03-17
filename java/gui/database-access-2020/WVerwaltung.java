package program;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class WVerwaltung extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 148636632574540818L;

	private JPanel mainPanel = new JPanel(new BorderLayout());
	private JPanel northPanel = new JPanel();
	private JScrollPane scrollPane = new JScrollPane();
	private JLabel lDatabase = new JLabel("Database: ");
	private JLabel lTable = new JLabel("Table: ");
	private JComboBox<String> cbTables = new JComboBox<>();
	private JComboBox<String> cbDatabases = new JComboBox<>();
	private JTable table;
	private DataAccess da;

	public WVerwaltung(DataAccess da) {
		super("Datenbankverwaltung");
		this.da = da;
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setResizable(false);
		init();
		this.setVisible(true);
	}

	private void init() {
		this.add(mainPanel);
		mainPanel.add(northPanel, BorderLayout.NORTH);
		northPanel.add(lDatabase);
		northPanel.add(cbDatabases);
		northPanel.add(lTable);
		northPanel.add(cbTables);
		mainPanel.add(scrollPane, BorderLayout.CENTER);
		fillCbDatabases();
		fillCbTables();
		fillTable();
		cbTables.addActionListener(new cbTablesListener());
		cbDatabases.addActionListener(new cbDatabasesListener());
	}
	
	private class tableListener implements TableModelListener{

		@Override
		public void tableChanged(TableModelEvent e) {
			System.out.println("WVerwaltung: tableListener --> table changed");
			int row = e.getFirstRow();
			int column = e.getColumn();
			if(row >= 0 && column >= 0){
				String newValue = (String) table.getValueAt(row, column);
				String[][] dataSet = new String[table.getColumnCount()][2];
				for(int i = 0; i < table.getColumnCount(); i++){
					if(i == column){
						continue;
					}else{
						dataSet[i][0] = table.getColumnName(i);
						dataSet[i][1] = (String) table.getValueAt(row, i);
					}
				}
				
				for(int i = 0; i < dataSet.length; i++){
					for(int j = 0; j < 2; j++){
						System.out.println(dataSet[i][j]);
					}
				}
			}
		}
		
	}

	private class cbTablesListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out
					.println("WVerwaltung: cbTablesListener --> action performed");
			fillTable();
		}
	}

	private class cbDatabasesListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out
					.println("WVerwaltung: cbDatabasesListener --> action performed");
			fillCbTables();
			fillTable();
		}
	}

	private void fillCbTables() {
		System.out.println("WVerwaltung: fillCbTables() called.");
		ArrayList<String> tables = da.getTables(cbDatabases.getSelectedItem()
				.toString());
		cbTables.removeAllItems();
		for (int i = 0; i < tables.size(); i++) {
			cbTables.addItem(tables.get(i));
		}
	}

	private void fillCbDatabases() {
		System.out.println("WVerwaltung: fillCbDatabases() called.");
		cbDatabases.removeAllItems();
		ArrayList<String> databases = da.getDatabases();
		for (int i = 0; i < databases.size(); i++) {
			cbDatabases.addItem(databases.get(i));
		}
	}

	private void fillTable() {
		System.out.println("WVerwaltung: fillTable() called.");
		if (cbTables.getSelectedItem() != ""
				&& cbTables.getSelectedItem() != null
				&& cbDatabases.getSelectedItem() != ""
				&& cbDatabases.getSelectedItem() != null) {
			ArrayList<ArrayList<String>> tableContent = da
					.getTableContent(cbTables.getSelectedItem().toString());
			ArrayList<String> columnNames = da.getColumnNames(cbTables
					.getSelectedItem().toString());

			String[] columns = new String[columnNames.size()];
			String[][] data = null;

			if (tableContent.size() > 0) {

				data = new String[tableContent.size()][tableContent.get(0)
						.size()];

				for (int i = 0; i < tableContent.size(); i++) {
					for (int j = 0; j < tableContent.get(i).size(); j++) {
						data[i][j] = tableContent.get(i).get(j);
						
					}
				}

			}

			for (int i = 0; i < columnNames.size(); i++) {
				columns[i] = columnNames.get(i);
			}

			table = new JTable(new DefaultTableModel(data, columns));
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addTableModelListener(new tableListener());
			//model.addRow(new Object[]{});
			table.getTableHeader().setReorderingAllowed(false);

			scrollPane.setViewportView(table);
		}
	}
}
