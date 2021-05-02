package lt.vu.persistence;

import lt.vu.entities.Category;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class CategoriesDAO {

    @Inject
    private EntityManager em;

    public List<Category> loadAll() {
        return em.createNamedQuery("Category.findAll", Category.class).getResultList();
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public void persist(Category category){
        this.em.persist(category);
    }

    public Category findOne(Integer id) {
        return em.find(Category.class, id);
    }
}
