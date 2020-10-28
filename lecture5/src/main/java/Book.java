public class Book {
    String title = "Test book";
    String author = "Random author";
    int numberOfPages = 100;

    String getAuthor() {
        return author;
    }

    public String toString() {
        return "Book{" +
            "title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", numberOfPages=" + numberOfPages +
            '}';
    }

    public Book() {
    }

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
