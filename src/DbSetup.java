import java.sql.*;
import java.util.Stack;

public class DbSetup {
    public static String url = "jdbc:mysql://localhost:3306/";
    public static Connection c = null;
    public static Statement s = null;
    public static String username = "root";
    public static String password = "admin123!";
    public static void CreateDb(){
        try{
            c = DriverManager.getConnection(url, username, password);
            s = c.createStatement();
            s.execute(Query.databaseCreate);
            System.out.println("Book Database created Successfully");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void createTable(){
        try{
            c = DriverManager.getConnection(url+"Book", username, password);
            s = c.createStatement();
            String query = "CREATE TABLE books ( " +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "title VARCHAR(255) NOT NULL, " +
                    "author VARCHAR(255) NOT NULL, " +
                    "year INT NOT NULL)";
            s.execute(query);
            System.out.println("Table is created");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
