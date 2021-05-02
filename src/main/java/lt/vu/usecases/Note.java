package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Person;
import lt.vu.persistence.NotesDAO;
import lt.vu.persistence.PeopleDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Model
public class Note implements Serializable {
    @Inject
    private PeopleDAO peopleDAO;

    @Inject
    private NotesDAO notesDAO;

    @Getter @Setter
    private lt.vu.entities.Note note;

    @Getter @Setter
    private Person person;

    @Getter
    private List<Person> allPeople;

    @Getter
    private List<SelectItem> allPeopleList = new ArrayList<>();

    @Getter @Setter
    private Integer personIdToAdd;

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer noteId = Integer.parseInt(requestParameters.get("noteId"));
        this.note = notesDAO.findOne(noteId);
        loadAllPeople();
    }

    private void loadAllPeople(){
        this.allPeople = peopleDAO.loadAll();
        for(Person p : allPeople) {
            this.allPeopleList.add(new SelectItem(p.getId(), p.getName()));
        }
    }

    @Transactional
    public String addPerson() {
        Set<Person> people = note.getPeople();
        Person person = this.peopleDAO.findOne(this.personIdToAdd);
        people.add(person);
        return "note?faces-redirect=true&noteId=" + this.note.getId();
    }
}
