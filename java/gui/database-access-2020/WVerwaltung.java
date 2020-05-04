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
	private JLabel lTable = new JLabel("Table: ");
	private JComboBox<String> cbTables = new JComboBox<>();
	private JTable table;
	private DataAccess da;
	private JPopupMenu pop = new JPopupMenu();
	private JMenuItem del = new JMenuItem("delete");

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
		northPanel.add(lTable);
		northPanel.add(cbTables);
		mainPanel.add(scrollPane, BorderLayout.CENTER);
		fillCbTables();
		fillTable();
		cbTables.addActionListener(new cbTablesListener());
		table.add(pop);
		pop.add(del);
		del.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				delRow();
			}
		});
	}

	private void delRow() {
		String[][] dataSet = new String[table.getColumnCount()][2];
		for(int i = 0; i < table.getColumnCount(); i++){
			dataSet[i][0] = table.getColumnName(i);
			dataSet[i][1] = (String) table.getValueAt(table.getSelectedRow(), i);
		}
		
		da.deleteRow(cbTables.getSelectedItem().toString(), dataSet);
		
		fillTable();
	}
	private class tableListener implements TableModelListener{
		@Override
		public void tableChanged(TableModelEvent e) {
			System.out.println("WVerwaltung: tableListener --> table changed");
			int row = e.getFirstRow();
			int column = e.getColumn();
			if(row == table.getRowCount() - 1) {
				if(column == table.getColumnCount() - 1) {
					String[] values = new String [table.getColumnCount()];
					for(int i = 0; i < table.getColumnCount(); i++) {
						values[i] = (String) table.getValueAt(row, i);
					}
					for(int i = 0; i < table.getColumnCount(); i++) {
						System.out.println(values[i]);
					}
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					da.newRow(cbTables.getSelectedItem().toString(), values);
					
					model.addRow(new Object[]{});
				}
			}else if(row >= 0 && column >= 0){
				String newValue = (String) table.getValueAt(row, column);
				String newValueColumn = table.getColumnName(column);
				String[][] dataSet = new String[table.getColumnCount()][2];
				for(int i = 0; i < table.getColumnCount(); i++){
					if(i == column){
						continue;
					}else{
						dataSet[i][0] = table.getColumnName(i);
						dataSet[i][1] = (String) table.getValueAt(row, i);
					}
				}
				
				da.updateValue(cbTables.getSelectedItem().toString(), newValueColumn, newValue, dataSet);
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

	private void fillCbTables() {
		System.out.println("WVerwaltung: fillCbTables() called.");
		ArrayList<String> tables = da.getTables("db_eurotrans");
		cbTables.removeAllItems();
		for (int i = 0; i < tables.size(); i++) {
			cbTables.addItem(tables.get(i));
		}
	}


	private void fillTable() {
		System.out.println("WVerwaltung: fillTable() called.");
		if (cbTables.getSelectedItem() != "" && cbTables.getSelectedItem() != null) {
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
			model.addRow(new Object[]{});
			table.getTableHeader().setReorderingAllowed(false);

			scrollPane.setViewportView(table);
			
			table.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent me) {
					if(SwingUtilities.isRightMouseButton(me)) {
						pop.show(table, me.getX(), me.getY());
					}
				}
			});
		}
	}
}