package oopWithNLayeredAppHomework.business.concretes;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppHomework.business.abstracts.ICategoryService;
import oopWithNLayeredAppHomework.business.rules.CategoryBusinessRules;
import oopWithNLayeredAppHomework.core.logging.ILogger;
import oopWithNLayeredAppHomework.dataAccess.abstracts.ICategoryDal;
import oopWithNLayeredAppHomework.entities.Category;

public class CategoryManager implements ICategoryService{
	private ICategoryDal categoryDal;
	private ArrayList<ILogger> loggers;
	
	public CategoryManager() {}
	
	public CategoryManager(ICategoryDal categoryDal, ArrayList<ILogger> loggers) {
		this.categoryDal = categoryDal;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		// business rules
		CategoryBusinessRules.isExists(category, categoryDal);
		categoryDal.add(category);	
		
		for (ILogger logger : loggers) {
			logger.log(category.getCategoryName() + " - Kategori eklendi.");
		}
		
	}

	@Override
	public List<Category> getAll() {
		return categoryDal.getAll();
	}


	
}
