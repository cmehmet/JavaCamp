package oopWithNLayeredAppHomework;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppHomework.business.concretes.CategoryManager;
import oopWithNLayeredAppHomework.business.concretes.CourseManager;
import oopWithNLayeredAppHomework.business.concretes.EducatorManager;
import oopWithNLayeredAppHomework.business.rules.CategoryBusinessRules;
import oopWithNLayeredAppHomework.business.rules.CourseBusinessRules;
import oopWithNLayeredAppHomework.core.logging.DatabaseLogger;
import oopWithNLayeredAppHomework.core.logging.FileLogger;
import oopWithNLayeredAppHomework.core.logging.ILogger;
import oopWithNLayeredAppHomework.core.logging.MailLogger;
import oopWithNLayeredAppHomework.dataAccess.concretes.HibernateCategoryDal;
import oopWithNLayeredAppHomework.dataAccess.concretes.HibernateCourseDal;
import oopWithNLayeredAppHomework.dataAccess.concretes.JdbcCategoryDal;
import oopWithNLayeredAppHomework.dataAccess.concretes.JdbcCourseDal;
import oopWithNLayeredAppHomework.dataAccess.concretes.JdbcEducatorDal;
import oopWithNLayeredAppHomework.entities.Category;
import oopWithNLayeredAppHomework.entities.Course;
import oopWithNLayeredAppHomework.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Educator educator = new Educator(1,"Ahmet", "Yılmaz");
		ArrayList<ILogger> loggers1 = new ArrayList<ILogger>(List.of(new DatabaseLogger(), new FileLogger()));
		EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDal(), loggers1);
		educatorManager.add(educator);
		
		System.out.println("----------------------------------------");
		
		Category category = new Category(4,"Veri Yapıları");
		ArrayList<ILogger> loggers2 = new ArrayList<ILogger>(List.of(new DatabaseLogger(),new FileLogger(),new MailLogger()));
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDal(),loggers2, new CategoryBusinessRules());
		categoryManager.add(category);
		
		System.out.println("----------------------------------------");
		
		
		Course course = new Course(5,"Java",200);
		ArrayList<ILogger> loggers3 = new ArrayList<ILogger>(List.of(new DatabaseLogger(),new MailLogger()));
		CourseManager courseManager = new CourseManager(new HibernateCourseDal(),loggers3,new CourseBusinessRules());
		courseManager.add(course);
		
		
		System.out.println("----------------------------------------");
		
		/*
		Course course = new Course(5,"C++",200);
		ArrayList<ILogger> loggers3 = new ArrayList<ILogger>(List.of(new DatabaseLogger(),new MailLogger()));
		CourseManager courseManager = new CourseManager(new HibernateCourseDal(),loggers3,new CourseBusinessRules());
		courseManager.add(course);
		*/
		
		
		

	}

}
