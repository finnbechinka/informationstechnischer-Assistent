package jda;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class WDaten extends JFrame{
	private static String url = null;
	private static String username = null;
	private static String password = null;
	private static Connection connection = null;
	private static boolean connectionError;
	
	private static JTextArea taData = new JTextArea();
	private static JComboBox<String> cbDatabases = new JComboBox<String>();
	private static JComboBox<String> cbTables = new JComboBox<String>();
	private JScrollPane sp = new JScrollPane(taData);
	private JPanel panel2 = new JPanel();
	private static JLabel lStatus = new JLabel("CONNECTED TO SERVER");
	private JPopupMenu pmMenu = new JPopupMenu();
	private JMenuItem miDisconnect = new JMenuItem("Disconnect");
	private JMenuItem miCustomQuery = new JMenuItem("Custom Query");
	
	public WDaten(String ip, String usr, String pasw) throws Exception {
		WDaten.url = "jdbc:mysql://" + ip + "/?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		WDaten.username = usr;
		WDaten.password = pasw;
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setTitle("Daten");
		this.setResizable(false);
		this.setVisible(true);
		WDaten.taData.setEditable(false);
		
		connectionError = false;	
		connection = getConnection();
		if(connectionError) {	
			connectionError();
		}

		getDatabases();
		init();
	}
	
	private void init(){
		this.getContentPane().add(sp, BorderLayout.CENTER);
		this.getContentPane().add(panel2, BorderLayout.NORTH);
		this.getContentPane().add(lStatus, BorderLayout.SOUTH);
		
		panel2.add(cbDatabases);
		panel2.add(cbTables);
		this.pmMenu.add(miCustomQuery);
		this.pmMenu.add(miDisconnect);
		WDaten.cbDatabases.setPreferredSize(new Dimension((this.getWidth()/2)-10, 25));
		WDaten.cbTables.setPreferredSize(new Dimension((this.getWidth()/2)-10, 25));

		WDaten.cbDatabases.addActionListener(new Listener());
		WDaten.cbTables.addActionListener(new Listener());
		this.miDisconnect.addActionListener(new Listener());
		this.miCustomQuery.addActionListener(new Listener());
		WDaten.taData.addMouseListener(new PopupListener());
	}
	
	private class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) { 
			if(e.getSource() == cbDatabases) {
				getTables();
				getTableContent();
			}else if(e.getSource() == cbTables) {
				getTableContent();
			}else if(e.getSource() == miDisconnect){
				disconnect();
			}else if(e.getSource() == miCustomQuery){
				@SuppressWarnings("unused")
				WCustomQuery qCQ = new WCustomQuery();
			}
		}
		
	}
	
	class PopupListener extends MouseAdapter {
	    public void mousePressed(MouseEvent e) {
	        maybeShowPopup(e);
	    }

	    public void mouseReleased(MouseEvent e) {
	        maybeShowPopup(e);
	    }

	    private void maybeShowPopup(MouseEvent e) {
	        if (e.isPopupTrigger()) {
	            pmMenu.show(e.getComponent(),
	                       e.getX(), e.getY());
	        }
	    }
	}
	
	public static void execCustomSelect(String query){
		try {			
			lStatus.setText("execCustomQuery: " + query);
			lStatus.setToolTipText("execCustomQuery: " + query);
			
			taData.setText(null);
			
			PreparedStatement customQuery = connection.prepareStatement(query);
			
			ResultSet result = customQuery.executeQuery();
			
			ResultSetMetaData metaData = result.getMetaData();
			int count = metaData.getColumnCount();
			String columnName[] = new String[count];
			for (int i = 1; i <= count; i++)
			{
			   columnName[i-1] = metaData.getColumnLabel(i);
			}
			
			String last = columnName[columnName.length-1];
			
			while(result.next()) {
				for(int i = 0; i < columnName.length; i++) {
					taData.append(columnName[i] + ": " + result.getString(columnName[i]) + "\n");
					
					if(last == columnName[i]) {
						taData.append("---------------\n");						
					}
				}
			}
		} catch (SQLException e) {System.out.println("execCustomQuery(): " + e);}
	}
	
	public static void useCustomDb(String query) {
		lStatus.setText("useCustomDb: " + query);
		lStatus.setToolTipText("useCustomDb: " + query);
		
		try {
			PreparedStatement useDatabase;
			useDatabase = connection.prepareStatement(query);
			useDatabase.executeQuery();
		} catch (SQLException e) {System.out.println("useCustomDb: " + e);}
	}
	
	private void disconnect(){
		try {
			connection.close();
		} catch (SQLException e) {System.out.println("disconnect(): " + e);}
		
		WLogin loginRedirect = new WLogin();
		loginRedirect.setTextFieldContents(url.substring(13, url.length()-99), username, "");
		dispose();
		
	}
	
	private void getDatabases() {
		try {
			PreparedStatement showDatabases = connection.prepareStatement("SHOW DATABASES");
			
			ResultSet result = showDatabases.executeQuery();
			
			while(result.next()) {
				WDaten.cbDatabases.addItem(result.getString("Database"));
			}
			
		} catch (Exception e) {System.out.println("getDatabases(): " + e);}
	}
	
	private void getTables() {
		try {
			PreparedStatement useDatabase = connection.prepareStatement("USE " + (String) cbDatabases.getSelectedItem());
			useDatabase.executeQuery();
			
			PreparedStatement showTables = connection.prepareStatement("SHOW TABLES");
			ResultSet result = showTables.executeQuery();
			WDaten.cbTables.removeAllItems();
			while(result.next()) {
				WDaten.cbTables.addItem(result.getString("Tables_in_" + (String) cbDatabases.getSelectedItem()));
			}
			
		} catch (Exception e) {System.out.println("getTables(): " + e);}
	}
	
	private void getTableContent() {
		try {
			WDaten.taData.setText(null);
			PreparedStatement selectAll = connection.prepareStatement("SELECT * FROM " + (String) cbTables.getSelectedItem());
			ResultSet result = selectAll.executeQuery();
			ResultSetMetaData metaData = result.getMetaData();
			int count = metaData.getColumnCount();
			String columnName[] = new String[count];
			for (int i = 1; i <= count; i++)
			{
			   columnName[i-1] = metaData.getColumnLabel(i);
			}
			
			String last = columnName[columnName.length-1];
			
			lStatus.setText("getTableContent of table " + (String) cbTables.getSelectedItem() + " within database " + (String) cbDatabases.getSelectedItem());
			
			while(result.next()) {
				for(int i = 0; i < columnName.length; i++) {
					WDaten.taData.append(columnName[i] + ": " + result.getString(columnName[i]) + "\n");
					if(last == columnName[i]) {
						WDaten.taData.append("---------------\n");						
					}
				}
			}
		} catch (SQLException e) {System.out.println("getTableContent(): " + e);}
	}
	
	private static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
			return conn;
			
		}catch(Exception e) {
			System.out.println("getConnection(): " + e);
			connectionError = true;
			}
		
		return null;
	}
	
	private void connectionError() {
		WLogin login = new WLogin();
		login.setTextFieldContents(url.substring(13, url.length()-99), username, password);
		@SuppressWarnings("unused")
		WErrorPopup ep = new WErrorPopup("A connection error occurred. Please verify you connection data!", "");
		dispose();
	}

}
