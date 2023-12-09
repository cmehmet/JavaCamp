package oopOdev.business.rules;

import oopOdev.dataAccess.abstracts.ICourseDal;
import oopOdev.entities.Course;

public class CourseBusinessRules {
	public void isExist(Course course,ICourseDal courseDal) throws Exception {
		boolean isExist = false;
		
		for(Course courseItem : courseDal.getAll()) {
			if (courseItem.getName() == course.getName()) {
				isExist = true;
			}		
		}
		if(isExist == true) {
			throw new Exception("Bu kurs zaten var.");
		}
	}
	
	public void isPriceValid(Course course) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz.");
		}
	}
}
