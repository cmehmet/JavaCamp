package oopWithNLayeredAppHomework.business.rules;

import oopWithNLayeredAppHomework.dataAccess.abstracts.ICategoryDal;
import oopWithNLayeredAppHomework.entities.Category;

public class CategoryBusinessRules {
	public static void isExists(Category category,ICategoryDal categoryDal) throws Exception {		
		
		for (Category categoryItem : categoryDal.getAll()) {
			if (category.getCategoryName().equals(categoryItem.getCategoryName())) {
				throw new Exception("Kategori zaten mevcut");
			}
		}

		
	}		
}
