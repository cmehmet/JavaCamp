package oopOdev;

import java.util.ArrayList;
import java.util.List;

import oopOdev.business.concretes.CategoryManager;
import oopOdev.business.concretes.CourseManager;
import oopOdev.business.concretes.EducatorManager;
import oopOdev.business.rules.CourseBusinessRules;
import oopOdev.core.logging.DatabaseLogger;
import oopOdev.core.logging.FileLogger;
import oopOdev.core.logging.ILogger;
import oopOdev.core.logging.MailLogger;
import oopOdev.dataAccess.concretes.HibernateCategoryDal;
import oopOdev.dataAccess.concretes.HibernateCourseDal;
import oopOdev.dataAccess.concretes.JdbcCourseDal;
import oopOdev.dataAccess.concretes.JdbcEducatorDal;
import oopOdev.entities.Category;
import oopOdev.entities.Course;
import oopOdev.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		Educator educator = new Educator(1,"Mehmet", "Atay");
		ArrayList<ILogger> loggers1 = new ArrayList<ILogger>(List.of(new DatabaseLogger(), new FileLogger()));
		EducatorManager educatorManager = new EducatorManager(new JdbcEducatorDal(), loggers1);
		educatorManager.add(educator);
		
		System.out.println();
		
		Category category = new Category(1,"Programlama");
		ArrayList<ILogger> loggers2 = new ArrayList<ILogger>(List.of(new DatabaseLogger(),new FileLogger(),new MailLogger()));
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDal(),loggers2);
		categoryManager.add(category);
		
		System.out.println();
		
		
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
