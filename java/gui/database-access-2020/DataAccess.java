package program;

import java.sql.*;
import java.util.*	;

public class DataAccess {
	private String username = "";
	private String password = "";
	private String ip = "";
	private Connection connection;

	public DataAccess(String username, String password, String ip) {
		this.username = username;
		this.password = password;
		this.ip = ip;
		connect();
	}

	private void connect() {
		System.out.println("DataAccess: connect() called.");
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://" + ip + "/";
			Class.forName(driver);

			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public ArrayList<String> getTables(String db){
		System.out.println("DataAccess: getTables() called.");
		ArrayList<String> tables = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.prepareStatement("use " + db);
			stmt.executeQuery();
			stmt.close();
			stmt = connection.prepareStatement("show tables");
			rs = stmt.executeQuery();
			while(rs.next()){
				tables.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {if(stmt != null) stmt.close();} catch (SQLException e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (SQLException e) {e.printStackTrace();}			
		}
		return tables;
	}
	
	public ArrayList<String> getDatabases(){
		System.out.println("DataAccess: getDatabases() called.");
		ArrayList<String> databases = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.prepareStatement("show databases");
			rs = stmt.executeQuery();
			while(rs.next()){
				databases.add(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {if(stmt != null) stmt.close();} catch (SQLException e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (SQLException e) {e.printStackTrace();}			
		}
		return databases;
	}
	
	public ArrayList<ArrayList<String>> getTableContent(String table){
		System.out.println("DataAccess: getTableContent() called.");
		ArrayList<ArrayList<String>> tableContent = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.prepareStatement("select * from " + table);
			rs = stmt.executeQuery();
		    ResultSetMetaData md = rs.getMetaData();
		    int row = -1;
		    while(rs.next()){
		    	row++;
		    	tableContent.add(new ArrayList<String>());
		    	for(int i = 1; i <= md.getColumnCount(); i++){
		    		tableContent.get(row).add(rs.getString(i));
		    	}
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {if(stmt != null) stmt.close();} catch (SQLException e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (SQLException e) {e.printStackTrace();}			
		}
		return tableContent;
	}
	
	public ArrayList<String> getColumnNames(String table){
		System.out.println("DataAccess: getColumnNames() called.");
		ArrayList<String> columnNames = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.prepareStatement("select * from " + table);
			rs = stmt.executeQuery();
		    ResultSetMetaData md = rs.getMetaData();
		    
		    for(int i = 1; i <= md.getColumnCount(); i++){
		    	columnNames.add(md.getColumnName(i));
		    }
		    
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {if(stmt != null) stmt.close();} catch (SQLException e) {e.printStackTrace();}
			try {if(rs != null) rs.close();} catch (SQLException e) {e.printStackTrace();}			
		}
		
		return columnNames;
	}
}
