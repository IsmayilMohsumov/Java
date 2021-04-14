package LinkedinCourse.Streams;


public class Book {
    private String author;
    private String bookName;

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return ("Author: "+author+ " Title :" +bookName);
    }
    
    public boolean checkStartsWith(String letter){
        return true;
        
    }
    
    
}
