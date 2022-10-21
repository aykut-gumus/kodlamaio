import business.CategoryManager;
import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCategoryDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course(1, "Java Kampı", 5000);
        Course course2 = new Course(2, "C# Kampı", 6500);
        Course course3 = new Course(3, "Javascript Kampı", 4750);
        List<Course> courses = new ArrayList<>();

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courses);
        courseManager.add(course1);

        System.out.println("--------------------------------------");

        Category category1 = new Category(1, "Web Yazılım");
        Category category2 = new Category(2, "Mobil Yazılım");
        List<Category> categories = new ArrayList<>();

        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
        categoryManager.add(category2);
    }
}