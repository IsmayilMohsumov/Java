package LinkedinCourse.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> books = completeList();
        books.forEach(item -> System.out.println(item));

        System.out.println("");
        for (Book book : books) {
            if (book.getAuthor().startsWith("P")) {
                System.out.println(book.toString());
            }
        }
        System.out.println("");

        books.stream().filter(book -> {
            return book.getAuthor().startsWith("P");
        })
                .filter(book -> {
                    return book.getBookName().endsWith("e");
                })
                .forEach(System.out::println);
        
        System.out.println("");

        List<String> strings = Arrays.asList("a", "z", "er", "bay", "", "", "can");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        long count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);
		
        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("How many string has 3 letter in it: " + count);
		
        filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
		
        String mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
        
        System.out.println("");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        System.out.println("");
        
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        numbers.stream().map(i -> i * i).distinct().forEachOrdered(System.out::println);

    }

    public static ArrayList<Book> completeList() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Paulo Coelho", "The Alchemist"));
        books.add(new Book("Paulo Coelho", "The Winner Stands Alone"));
        books.add(new Book("Paulo Coelho", "The Devil and Miss Prym"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Home and Exercise"));
        books.add(new Book("Jane Austen", "Exile"));
        books.add(new Book("Jane Austen", "The Color Purple"));

        return books;
    }
}
