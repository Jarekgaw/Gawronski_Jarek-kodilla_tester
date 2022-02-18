public class Book {
    private String author;
    private String title;

    public Book (String autor, String tytul) {
        this.author = autor;
        this.title = tytul;
    }
    public static Book of(String autor, String tytul) {

        return new Book(autor, tytul);
    }

}
