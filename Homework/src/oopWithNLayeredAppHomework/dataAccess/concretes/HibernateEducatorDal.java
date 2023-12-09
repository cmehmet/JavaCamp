package oopWithNLayeredAppHomework.dataAccess.concretes;

import oopWithNLayeredAppHomework.dataAccess.abstracts.IEducatorDal;
import oopWithNLayeredAppHomework.entities.Educator;

public class HibernateEducatorDal implements IEducatorDal{

	@Override
	public void add(Educator educator) {
		// Hibernate kodları
		System.out.println("Hibernate : (" + educator.getFirstName() + ") veritabanına eklendi.");
		
	}

}
