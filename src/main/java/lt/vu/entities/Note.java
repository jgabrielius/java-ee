package lt.vu.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "NOTE")
@Getter @Setter
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 500)
    @Column(name = "NOTE", unique = true)
    private String note;

    @Size(max = 50)
    @Column(name = "LABEL")
    private String label;

    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;

    @ManyToMany
    Set<Person> people;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer version;

    public Note() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(note, note.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note);
    }
}
