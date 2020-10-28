public class BookExample {
    public static void main(String[] args) {
        Book greatBook = new Book("Great book for Java", "Gosling", 2000);
        String stringOfGreatBook = greatBook.toString();
        System.out.println(stringOfGreatBook);
        
        Book anotherGreatBook;
        anotherGreatBook = new Book("Another great book for C", "Shildt", 1000);
        
        Book defaultBook = new Book();
        
        System.out.println( "Title: " + defaultBook.title + "\n" +
                            "Author: " + defaultBook.author + "\n" +
                            "Number of pages: " + defaultBook.numberOfPages + "\n");
    }
}
