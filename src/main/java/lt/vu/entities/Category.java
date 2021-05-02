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
        @NamedQuery(name = "Category.findAll", query = "select c from Category as c")
})
@Table(name = "CATEGORY")
@Getter @Setter
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 50)
    @Column(name = "NAME", unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    Set<Note> notes;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer version;

    public Category() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
