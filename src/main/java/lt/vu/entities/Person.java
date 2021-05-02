package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@NamedQueries({
        @NamedQuery(name = "Person.findAll", query = "select p from Person as p")
})
@Table(name = "PERSON")
@Getter @Setter
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 255)
    @Column(name = "NAME", unique = true)
    private String name;

    @ManyToMany(mappedBy = "people")
    Set<Note> notes;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer version;

    public Person() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
