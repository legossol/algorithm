package bookstore;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter @Getter
public class BookStore {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "bookStore")
    private Set<Book> books =new HashSet<>();

    public void add(Book book){
        getBooks().add(book);
    }
}
