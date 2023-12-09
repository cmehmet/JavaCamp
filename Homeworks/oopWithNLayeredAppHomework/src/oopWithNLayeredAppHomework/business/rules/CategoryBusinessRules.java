package oopWithNLayeredAppHomework.business.rules;

import oopWithNLayeredAppHomework.dataAccess.abstracts.ICategoryDal;
import oopWithNLayeredAppHomework.entities.Category;

public class CategoryBusinessRules {
	public void isExists(Category category,ICategoryDal categoryDal) throws Exception {
		boolean isExists = false;
		
		for (Category categoryItem : categoryDal.getAll()) {
			if (category.getCategoryName().equals(categoryItem.getCategoryName())) {
				isExists=true;
			}
		}
		
		if (isExists) {
			throw new Exception("Kategori zaten mevcut");
		}
	}
		
		
}
