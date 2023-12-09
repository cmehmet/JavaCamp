package oopWithNLayeredAppHomework.business.rules;

import oopWithNLayeredAppHomework.dataAccess.abstracts.ICourseDal;
import oopWithNLayeredAppHomework.entities.Course;

public class CourseBusinessRules {
	public void isExists(Course course,ICourseDal courseDal) throws Exception {
		boolean isExists = false;
		
		for(Course courseItem : courseDal.getAll()) {
			if (courseItem.getName() == course.getName()) {
				isExists = true;
			}		
		}
		if(isExists) {
			throw new Exception("Bu kurs zaten var.");
		}
	}
	
	public void isPriceValid(Course course) throws Exception {
		if (course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0 dan küçük olamaz.");
		}
	}
}
