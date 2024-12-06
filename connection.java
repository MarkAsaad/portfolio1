package graduation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class connection 
{
    public static Connection con;
    
    public static void ConnectToSQL() throws SQLException
    {
  
       String url="jdbc:sqlserver://localhost;databaseName=Grad";
       String user="X TEAM";
       String password="ABCM";
          con = DriverManager.getConnection(url, user, password);
             try
             {
               System.out.println("Connection True");
             }   
            
            catch(Exception e)
            {
              System.out.println(e);
            }
    }
 
 public static void Close () 
 {
      try 
      { 
        con.close();
      }
    
      catch (SQLException ex) 
      { 
        System.out.println("Connection Erorr");
      }
 }
 
  public static boolean executeQuary (String sqlStatement) 
  {
     try
     { 
       Statement stmt = con.createStatement();
       stmt.execute(sqlStatement);
       return true;
     }
    
     catch (SQLException e)
     {
      System.out.println(e);
      return false;
     }
  }
}