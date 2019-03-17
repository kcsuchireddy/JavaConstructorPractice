package love.programming;

public class Book {
    private String bookGenre;
    private String bookName;
    private int noOfPages;


public Book(){
    System.out.println("this is a no argument constructor");
}

public Book(String bookGenre){
    this.bookGenre = bookGenre;
    System.out.println("this bookGenre is " + bookGenre );
}

public Book(String bookGenre, String bookName){
    this.bookGenre = bookGenre;
    this.bookName = bookName;
    System.out.println("this bookGenre is " + bookGenre + "this bookName is " + bookName);
}

public Book(String bookGenre, String bookName, int noOfPages){
    this.bookGenre = bookGenre;
    this.bookName = bookName;
    this.noOfPages = noOfPages;
    System.out.println("this bookGenre is"  + bookGenre + "this bookName is " + bookName + "no of pages is " + noOfPages );

}

    // Define constructors with no arguments,
    // 1 argument(bookGenre), 2 arguments(bookGenre and bookName)
    // and 3 arguments(bookGenre, bookName and noOfPages).
    // Now in MyMainClass which has main() method, please create 4 Book objects with different constructors.
    // Tyr to print values of variables in the Book objects.
}
