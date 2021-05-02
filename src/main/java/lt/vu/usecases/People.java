package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Category;
import lt.vu.entities.Person;
import lt.vu.persistence.CategoriesDAO;
import lt.vu.persistence.PeopleDAO;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class People {

    @Inject
    private PeopleDAO peopleDAO;

    @Getter @Setter
    private Person personToCreate = new Person();

    @Getter
    private List<Person> allPeople;

    @PostConstruct
    public void init(){
        loadAllPeople();
    }

    @Transactional
    public String createPerson(){
        this.peopleDAO.persist(personToCreate);
        return "index?faces-redirect=true";
    }

    private void loadAllPeople(){
        this.allPeople = peopleDAO.loadAll();
    }
}
