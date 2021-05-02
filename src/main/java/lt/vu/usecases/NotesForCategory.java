package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.entities.Category;
import lt.vu.entities.Note;
import lt.vu.persistence.CategoriesDAO;
import lt.vu.persistence.NotesDAO;
import lt.vu.services.LengthLabelGenerator;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

@Model
public class NotesForCategory implements Serializable {

    @Inject
    private CategoriesDAO categoriesDAO;

    @Inject
    private LengthLabelGenerator lengthLabelGenerator;

    @Inject
    private NotesDAO notesDAO;

    @Getter @Setter
    private Category category;

    @Getter @Setter
    private Note noteToCreate = new Note();

    @PostConstruct
    public void init() {
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer categoryId = Integer.parseInt(requestParameters.get("categoryId"));
        this.category = categoriesDAO.findOne(categoryId);
    }

    @Transactional
    public String createNote() {
        noteToCreate.setCategory(this.category);
        noteToCreate.setLabel(this.lengthLabelGenerator.generateLabel(noteToCreate.getNote().length()));
        notesDAO.persist(noteToCreate);
        return "notes?faces-redirect=true&categoryId=" + this.category.getId();
    }
}
