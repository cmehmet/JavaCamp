package oopWithNLayeredAppHomework.business.concretes;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppHomework.business.abstracts.ICourseService;
import oopWithNLayeredAppHomework.business.rules.CourseBusinessRules;
import oopWithNLayeredAppHomework.core.logging.ILogger;
import oopWithNLayeredAppHomework.dataAccess.abstracts.ICourseDal;
import oopWithNLayeredAppHomework.entities.Course;

public class CourseManager implements ICourseService{
	private ICourseDal courseDal;
	private ArrayList<ILogger> loggers;
	
	public CourseManager(ICourseDal courseDal, ArrayList<ILogger> loggers) {
		this.courseDal = courseDal;
		this.loggers = loggers;
	}

	@Override
	public void add(Course course) throws Exception {
		CourseBusinessRules.isExists(course, courseDal);
		CourseBusinessRules.isPriceValid(course);
		courseDal.add(course);
		
		for (ILogger logger : loggers) {
		logger.log(course.getName() + " - Kurs eklendi.");		
		}
	}

	@Override
	public List<Course> getAll() {
		return courseDal.getAll();
	}
	
	
}
