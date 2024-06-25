public class Query {
    static String databaseCreate = "CREATE DATABASE Book";
    static String addData = "INSERT INTO Books (title, author, year) values (?, ?, ?)";
    static String Display = "SELECT * FROM Books";
    static String updateDetail = "UPDATE Books SET title = ?, author = ?, year = ? WHERE title = ? AND author = ? AND year = ? ";
    static String Delete = "DELETE FROM books WHERE id = ?";
}
