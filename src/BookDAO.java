import java.sql.*;

public class BookDAO{
    public static void  AddBook(Book b){
        try{
            Connection c = DatabaseConnection.connectionSetup();
            PreparedStatement pst = c.prepareStatement(Query.addData);
            pst.setString(1, b.getTitle());
            pst.setString(2, b.getAuthor());
            pst.setInt(3, b.getYear());
            pst.executeUpdate();
            c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void getAllBooks(){
        try{
            Connection c = DatabaseConnection.connectionSetup();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery(Query.Display);
            while (rs.next()){
                System.out.println("id = "+rs.getInt(1));
                System.out.println("Title = "+rs.getString(2));
                System.out.println("Author = "+ rs.getString(3));
                System.out.println("Year = "+ rs.getInt(4));
            }
            c.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void updateDetails(Book b1, Book b2) {
            try {
                Connection c = DatabaseConnection.connectionSetup();
                PreparedStatement pst = c.prepareStatement(Query.updateDetail);
                pst.setString(1, b2.getTitle() );
                pst.setString(2, b2.getAuthor());
                pst.setInt(3, b2.getYear());
                pst.setString(4, b1.getTitle() );
                pst.setString(5, b1.getAuthor());
                pst.setInt(6, b1.getYear());
                pst.executeUpdate();
                c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    public static void deleteBook(int id){
        try {
            Connection c = DatabaseConnection.connectionSetup();
            PreparedStatement pst = c.prepareStatement(Query.Delete);
            pst.setInt(1, id);
            pst.executeUpdate();
            c.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
