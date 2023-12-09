package oopWithNLayeredAppHomework.dataAccess.abstracts;

import java.util.List;

import oopWithNLayeredAppHomework.entities.Course;

public interface ICourseDal {
	void add(Course course);
	List<Course> getAll();
}
