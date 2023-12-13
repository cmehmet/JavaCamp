package oopWithNLayeredAppHomework.business.abstracts;

import java.util.List;

import oopWithNLayeredAppHomework.entities.Course;

public interface ICourseService {
	void add(Course course) throws Exception;
	List<Course> getAll();
}
