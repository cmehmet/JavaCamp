package oopOdev.business.concretes;

import java.util.ArrayList;

import oopOdev.business.abstracts.ICourseService;
import oopOdev.core.logging.ILogger;
import oopOdev.dataAccess.abstracts.ICourseDal;
import oopOdev.entities.Course;
import oopOdev.business.rules.CourseBusinessRules;
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
		this.courseBusinessRules.isExist(course, courseDal);
		
		courseDal.add(course);
		for (ILogger logger : loggers) {
		logger.log(course.getName() + " course added");
				
		}

	}
	
	
}
