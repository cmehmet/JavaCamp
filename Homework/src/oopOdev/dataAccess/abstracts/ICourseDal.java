package oopOdev.dataAccess.abstracts;

import java.util.List;

import oopOdev.entities.Course;

public interface ICourseDal {
	void add(Course course);
	List<Course> getAll();
}
