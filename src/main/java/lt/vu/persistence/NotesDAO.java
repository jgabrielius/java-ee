package lt.vu.persistence;

import lt.vu.entities.Note;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class NotesDAO {

    @Inject
    private EntityManager em;

    public void persist(Note note){
        this.em.persist(note);
    }

    public Note findOne(Integer id){
        return em.find(Note.class, id);
    }

    public Note update(Note note){
        return em.merge(note);
    }
}
