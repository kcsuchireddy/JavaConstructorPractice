package love.programming;

public class MyMainClass {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book("Fiction ");
        Book book3 = new Book("Fiction ", "Pride and Prejudice");
        Book book4 = new Book("Fiction ", "Pride and Prejudice " , 329);

        Book book5 = new Book();
        Book book6 = new Book(" Thriller ");
        Book book7 = new Book(" Thriller ", "Silence of the Lambs ", 400);

        //country objects

        Country country1 = new Country();
        Country country2 = new Country("India ");
        Country country3 = new Country("India ", 150," Asia");
        Country country5 = new Country("United Kingdom ",70, " Europoe");
    }

}