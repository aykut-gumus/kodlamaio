package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {
        for (Category category_ : categories) {
            if (category.getCategoryName().equals(category_.getCategoryName())) {
                throw new Exception("Kategori ismi aynı olamaz");
            }
        }

        for (Logger logger : loggers) {
            logger.log(category.getCategoryName());
        }
        categoryDao.add(category);
    }
}