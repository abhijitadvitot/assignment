import java.util.Objects;

public class Book {


        private Integer isbn;
        private String title;

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                '}';
     }

   public  void initlization()
   {
       System.out.println("This is creating");
   }

    public  void delelting()
    {
        System.out.println("This is delelting");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title);
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
