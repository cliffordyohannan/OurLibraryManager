/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.our.lm.db;

/**
 *
 * @author CLIFFORD
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DBConnectionManager {
	Connection MySQLConnection=null;
	//ZXMLParserImpl xmlParser;
	String JDBCDriverString,DBServerHost,DBServerPort,DBUserName,DBUserPassword,DGDBName;

	public DBConnectionManager()
	{
		//xmlParser=new ZXMLParserImpl();
		JDBCDriverString="com.mysql.jdbc.Driver";
		DBServerHost="localhost";
		DBServerPort="3306";
		DBUserName="root";
		DBUserPassword="root";
		DGDBName=OurConstants.DB_NAME;

		System.out.println("DBConfig.JDBCDriverString "+JDBCDriverString);
		System.out.println("DBConfig.DBServerHost "+DBServerHost);
		System.out.println("DBConfig.DBServerPort "+DBServerPort);
		System.out.println("DBConfig.DBUserName "+DBUserName);
		System.out.println("DBConfig.DBUserPassword "+DBUserPassword);
                //Create database
                String connString="jdbc:mysql://"+DBServerHost
			+"/?"+"user="+DBUserName+"&"+"password="+DBUserPassword;
                int ret = CreateDatabase(connString,OurConstants.DB_NAME);
                System.out.println("CreateDatabase Ret :" +ret);
	}
        
        private int CreateDatabase(String cString,String dbName)
        {
            try {
                String qString  = "CREATE DATABASE "+dbName; 
                Connection conn = DriverManager.getConnection(cString);
                Statement stmt  = conn.createStatement();
                int result      = stmt.executeUpdate(qString);
                
                
            } catch (SQLException ex) {
                return -1;
              
            }
            
            return 0;
        }
        
	public int getDBConnection()
	{
		if(loadDBDriver())
		{
			System.out.println("[CLSDB][getDBConnection]MySQL DRIVER LOADED");

			if(connectDB())
			{

				System.out.println("[CLSDB][getDBConnection]MySQL DATABASE CONNECTED");
				return 0;
			}
			else
			{
				System.out.println("[CLSDB][getDBConnection]MySQL DATABASE CONNECTION FAILED");
				return -1;
			}

		}
		return -2;
	}

	private boolean loadDBDriver()

		{
			try
			{
			Class.forName(JDBCDriverString).newInstance();
			return true;
			}
	        catch(Exception cEx)
	        {
	        	System.out.println("[EXCPN][CLSDB][loadDBDriver]");
	        	cEx.printStackTrace();
	        	return false;

	        }
		}
	private boolean connectDB()
	{
		try
		{

			String dbConnectionString="jdbc:mysql://"+DBServerHost
			+"/"+DGDBName+"?"+"user="+DBUserName+"&"+"password="+DBUserPassword;
			System.out.println("Connection String"+dbConnectionString);
			//String dbConnectionString="jdbc:mysql://localhost/testdb?user=root&password=1234";
			//System.out.println("Connection String"+dbConnectionString);
			if(MySQLConnection==null)
			{
				MySQLConnection=DriverManager.getConnection(dbConnectionString);
			}
			if(MySQLConnection==null)
			{
				return false;
			}
			System.out.println("Database Connected........");
			return true;

		}
		catch(SQLException sEx)
		{
			System.out.println("SQLException:"+sEx.getMessage());
			System.out.println("SQLState:"+sEx.getSQLState());
			System.out.println("VendorError:"+sEx.getErrorCode());
			return false;

		}
	}
	public boolean isDBConnected()
	{
		if(MySQLConnection!=null)
			return true;
			return false;
	}
	public void cleanUP()
	{
		if(MySQLConnection!=null)
			MySQLConnection=null;
	}
	public Connection getConnectionHandle()
	{
		return MySQLConnection;
	}
}
