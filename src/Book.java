public class Book {
    public int id;
    public String title;
    public String author;
    public int year;
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public Book(int id, String title, String author, int year){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Book [ id = "+ id + ", title = "+ title+
                ", author = "+ author+", year = "+ year+ " ]";
        }
    }
