package oopOdev.business.concretes;

import java.util.ArrayList;

import oopOdev.business.abstracts.ICategoryService;
import oopOdev.core.logging.ILogger;
import oopOdev.dataAccess.abstracts.ICategoryDal;
import oopOdev.entities.Category;

public class CategoryManager implements ICategoryService{
	private ICategoryDal categoryDal;
	private ArrayList<ILogger> loggers;
	
	public CategoryManager() {}
	
	public CategoryManager(ICategoryDal categoryDal, ArrayList<ILogger> loggers) {
		this.categoryDal = categoryDal;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) {
		// business
		categoryDal.add(category);		
		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		
	}


	
}
