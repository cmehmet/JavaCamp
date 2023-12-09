package oopOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import oopOdev.dataAccess.abstracts.ICourseDal;
import oopOdev.entities.Course;

public class JdbcCourseDal implements ICourseDal{
	List<Course>courses;
	
	public JdbcCourseDal() {
		courses = new ArrayList<Course>();
		courses.add(new Course(1,"Java",100));
		courses.add(new Course(2,"C#",100));
		courses.add(new Course(3,"Python",95));
		courses.add(new Course(4,"Sql",90));
		// Database simulation for business rules
	}
	
	
	@Override
	public void add(Course course) {
		// JDBC codes
		courses.add(course);
		System.out.println("JDBC : Kurs veritabanına eklendi.");
	}
	
	public List<Course> getAll(){
		return courses;
	}
	
}

