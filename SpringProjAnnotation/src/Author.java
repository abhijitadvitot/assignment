import java.util.Objects;

public class Author {
    private long authorId;
    private String name;

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorId == author.authorId && Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, name);
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
