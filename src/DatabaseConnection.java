import java.sql.*;
public class DatabaseConnection {
    public static Connection con = null;
   public static Connection connectionSetup(){
       try{
           String url = "jdbc:mysql://localhost:3306/Book";
           String username = "root";
           String password = "admin123!";
           con = DriverManager.getConnection(url, username, password);
       }
       catch(Exception e){
           e.printStackTrace();
       }
       return con;
   }
}
