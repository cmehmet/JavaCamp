package oopOdev.dataAccess.concretes;

import oopOdev.dataAccess.abstracts.IEducatorDal;
import oopOdev.entities.Educator;

public class HibernateEducatorDal implements IEducatorDal{

	@Override
	public void add(Educator educator) {
		// Hibernate kodları
		System.out.println("Hibernate : (" + educator.getFirstName() + ") veritabanına eklendi.");
		
	}

}
