package lt.vu.usecases;

import lombok.Getter;
import lombok.Setter;
import lt.vu.mybatis.dao.CategoryMapper;
import lt.vu.mybatis.model.Category;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class Categories {
    @Inject
    private CategoryMapper categoryMapper;

    @Getter @Setter
    private Category categoryToCreate = new Category();

    @Getter
    private List<Category> allCategories;

    @PostConstruct
    public void init(){
        loadAllCategories();
    }

    @Transactional
    public String createCategory(){
        this.categoryMapper.insert(categoryToCreate);
        return "index?faces-redirect=true";
    }

    private void loadAllCategories(){
        this.allCategories = categoryMapper.selectAll();
    }
}
