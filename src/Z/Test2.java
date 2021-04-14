package Z;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Book{
    private Integer id;
    private String bookName;

    public Book(Integer id, String bookName) {
        this.id = id;
        this.bookName = bookName;
    }

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "id=" + id + ", bookName=" + bookName ;
    }
    
    
    
}

public class Test2 {
    private List<Book> books;

    public Test2() {
    books = new ArrayList<>();
    books.add( new Book(1,"Sherlock"));
    books.add( new Book(2,"Papa"));
    }
    
    public Book getById(int id){
        Optional<Book> optional =books.stream().filter(elemet -> elemet.getId() ==id).findFirst();
        return optional.orElse(new Book(0, "Null"));
    }
    
    public List<Book> getAll(){
        return books;
    }
    
    
    public static void main(String[] args) {
        Test2 test= new Test2();
        System.out.println(test.getAll());
        
    }
    
}
