public final class Book {
    final private int pages;
    final private String title;
    private final Author author;


    private Book(int pages, String title, Author author) {
        this.pages = pages;
        this.title = title;
        this.author = (Author) author.clone();
    }


    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return (Author) author.clone();
    }

    public Book setName(String name){
        return new Book(this.pages, name, this.author);
    }

    public Book setPages(int pages){
        return new Book(pages, this.title, this.author);
    }

    public Book setAuthor(Author author){
        return new Book(this.pages, this.title, author);
    }
}
