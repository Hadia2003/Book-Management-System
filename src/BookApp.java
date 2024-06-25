import java.util.*;

public class BookApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO BOOK MANAGEMENT SYSTEM");
//        DbSetup.CreateDb();
//        DbSetup.createTable();
        while (true) {
            System.out.println("CHOICE OPTION TO PERFORM OPERATION\n" +
                    "1. ADD BOOK\n" +
                    "2. GET ALL BOOKS\n" +
                    "3. UPDATE BOOK\n" +
                    "4. DELETE BOOK\n");
            int choice = input.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("Enter Title, author, year of publishing of book");
                    String t = input.next();
                    String a = input.next();
                    int y = input.nextInt();
                    Book b = new Book(t, a, y);
                    BookDAO.AddBook(b);
                    break;
                case 2:
                    System.out.println("The Data of tables are given next");
                    BookDAO.getAllBooks();
                    break;
                case 3:
                    System.out.println("Enter data to which u want to update: " +
                            "1. Title\n" +
                            "2. Author\n" +
                            "3. Year\n");
                    String y2 = input.next();
                    String r = input.next();
                    int u = input.nextInt();
                    Book b1 = new Book(y2, r, u);
                    System.out.println("Enter data to whom update data to:\n" +
                            "1. Title\n" +
                            "2. Author\n" +
                            "3. Year");
                    String y1 = input.next();
                    String r2 = input.next();
                    int u3 = input.nextInt();
                    Book b2 = new Book(y1, r2, u3);
                    BookDAO.updateDetails(b1, b2);
                    break;
                case 4:
                    System.out.println("Enter ID to delete:");
                    int id1 = input.nextInt();
                    BookDAO.deleteBook(id1);
                    break;
            }
        }
    }
}
