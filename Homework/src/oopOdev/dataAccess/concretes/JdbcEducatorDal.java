package oopOdev.dataAccess.concretes;

import oopOdev.dataAccess.abstracts.IEducatorDal;
import oopOdev.entities.Educator;

public class JdbcEducatorDal implements IEducatorDal{

	@Override
	public void add(Educator educator) {
		// JDBC kodları
		System.out.println("JDBC : Eğitmen (" + educator.getFirstName() + ") veritabanına eklendi.");
		
	}

}
