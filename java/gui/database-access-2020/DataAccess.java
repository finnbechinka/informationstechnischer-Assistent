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
	
	public void updateValue(String table, String column, String value, String[][] dataSet) {
		System.out.println("DataAccess: updateValue() called.");
		PreparedStatement stmt = null;
		PreparedStatement meta = null;
		String str = "";
		
		try {
			meta = connection.prepareStatement("describe " + table);
			
			ResultSet rs = meta.executeQuery();
			String primary = "";
			while(rs.next()) {
				if(rs.getString(4).equals("PRI")) {
					primary = rs.getString(1);
				}
			}
			System.out.println(primary);
			
			String primaryval = "";
			
			for(int i = 0; i < dataSet.length; i++) {
				for(int j = 0; j < dataSet[1].length; j++) {
					if(dataSet[i][0] != null && dataSet[i][0].equals(primary)) {
						primaryval = dataSet[i][1];
						break;
					}
				}
			}
			
			str = "update " + table + " set " + column + " = '" + value + "' where " + primary + " = '" + primaryval + "'";
			System.out.println(str);
		    
			stmt = connection.prepareStatement(str);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {if(stmt != null) stmt.close();} catch (SQLException e) {e.printStackTrace();}		
		}
	}
	
	public void newRow(String table, String[] values) {
		System.out.println("DataAccess: newRow() called.");
		PreparedStatement stmt = null;
		String str = "insert into " + table + " values(";
		for(int i = 0; i < values.length; i++) {
			str = str + "'" + values[i] + "'";
			if(i != values.length - 1) {
				str = str + ",";
			}
		}
		str = str + ");";
		
		System.out.println(str);
		
		try {
			stmt = connection.prepareStatement(str);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {if(stmt != null) stmt.close();} catch (SQLException e) {e.printStackTrace();}		
		}
	}
	
	public void deleteRow(String table, String[][] values) {
		System.out.println("DataAccess: deleteRow() called.");
		PreparedStatement stmt = null;
		PreparedStatement meta = null;
		String str = "delete from " + table + " where ";
		
		try {
			meta = connection.prepareStatement("describe " + table);
			
			ResultSet rs = meta.executeQuery();
			String primary = "";
			while(rs.next()) {
				if(rs.getString(4).equals("PRI")) {
					primary = rs.getString(1);
				}
			}
			
			str = str + primary + " = ";
			
			for(int i = 0; i < values.length; i++) {
				if(values[i][0].equals(primary)) {
					str = str + values[i][1];
				}
			}
			
			stmt = connection.prepareStatement(str);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {if(stmt != null) stmt.close();} catch (SQLException e) {e.printStackTrace();}		
		}
	}
}