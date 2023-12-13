package oopWithNLayeredAppHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppHomework.dataAccess.abstracts.ICourseDal;
import oopWithNLayeredAppHomework.entities.Course;

public class HibernateCourseDal implements ICourseDal{
	List<Course> courses = new ArrayList<Course>();
	
	public HibernateCourseDal() {
		courses.add(new Course(1,"Java",100));
		courses.add(new Course(2,"C#",100));
		courses.add(new Course(3,"Python",95));
		courses.add(new Course(4,"Sql",90));
		// Database simulation for business rules
	}

	@Override
	public void add(Course course) {
		courses.add(course);
		System.out.println("Hibernate : Kurs (" + course.getName() + ") veritabanına eklendi.");
	}

	@Override
	public List<Course> getAll() {
		return courses;
	}

}
