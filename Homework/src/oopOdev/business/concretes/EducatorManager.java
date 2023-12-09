package oopOdev.business.concretes;

import java.util.ArrayList;

import oopOdev.business.abstracts.IEducatorService;
import oopOdev.core.logging.ILogger;
import oopOdev.dataAccess.abstracts.IEducatorDal;
import oopOdev.entities.Educator;

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
			logger.log(educator.getFirstName());
		}
	}
	
	
}
