package oopWithNLayeredAppHomework.business.concretes;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.business.abstracts.ICourseService;
import oopWithNLayeredAppHomework.business.rules.CourseBusinessRules;
import oopWithNLayeredAppHomework.core.logging.ILogger;
import oopWithNLayeredAppHomework.dataAccess.abstracts.ICourseDal;
import oopWithNLayeredAppHomework.entities.Course;
public class CourseManager implements ICourseService{
	private ICourseDal courseDal;
	private ArrayList<ILogger> loggers;
	private CourseBusinessRules courseBusinessRules;
	
	public CourseManager(ICourseDal courseDal, ArrayList<ILogger> loggers, CourseBusinessRules courseBusinessRules) {
		this.courseDal = courseDal;
		this.loggers = loggers;
		this.courseBusinessRules=courseBusinessRules;
	}
	

	@Override
	public void add(Course course) throws Exception {
		
		this.courseBusinessRules.isPriceValid(course);
		this.courseBusinessRules.isExists(course, courseDal);
		
		courseDal.add(course);
		for (ILogger logger : loggers) {
		logger.log(course.getName() + " - Kurs eklendi.");
				
		}

	}
	
	
}
