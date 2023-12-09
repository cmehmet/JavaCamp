package oopWithNLayeredAppHomework.business.concretes;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.business.abstracts.IEducatorService;
import oopWithNLayeredAppHomework.core.logging.ILogger;
import oopWithNLayeredAppHomework.dataAccess.abstracts.IEducatorDal;
import oopWithNLayeredAppHomework.entities.Educator;

public class EducatorManager implements IEducatorService{
	IEducatorDal educatorDal;
	ArrayList<ILogger> loggers;
	
	public EducatorManager(IEducatorDal educatorDal, ArrayList<ILogger> loggers) {
		this.educatorDal=educatorDal;
		this.loggers = loggers;
	}

	@Override
	public void add(Educator educator) {
		// business 
		educatorDal.add(educator);
		for(ILogger logger : loggers) {
			logger.log(educator.getFirstName() + " " + educator.getLastName() + " - Eğitmen ekledi.");
		}
	}
	
	
}
