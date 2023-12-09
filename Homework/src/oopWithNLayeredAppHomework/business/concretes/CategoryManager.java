package oopWithNLayeredAppHomework.business.concretes;

import java.util.ArrayList;

import oopWithNLayeredAppHomework.business.abstracts.ICategoryService;
import oopWithNLayeredAppHomework.business.rules.CategoryBusinessRules;
import oopWithNLayeredAppHomework.core.logging.ILogger;
import oopWithNLayeredAppHomework.dataAccess.abstracts.ICategoryDal;
import oopWithNLayeredAppHomework.entities.Category;

public class CategoryManager implements ICategoryService{
	private ICategoryDal categoryDal;
	private ArrayList<ILogger> loggers;
	private CategoryBusinessRules categoryBusinessRules;
	
	public CategoryManager() {}
	
	public CategoryManager(ICategoryDal categoryDal, ArrayList<ILogger> loggers, CategoryBusinessRules categoryBusinessRules) {
		this.categoryDal = categoryDal;
		this.loggers = loggers;
		this.categoryBusinessRules = categoryBusinessRules;
	}

	@Override
	public void add(Category category) throws Exception {
		// business rules
		this.categoryBusinessRules.isExists(category, categoryDal);
		
		categoryDal.add(category);	
		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName() + " - Kategori eklendi.");
		}
		
	}


	
}
