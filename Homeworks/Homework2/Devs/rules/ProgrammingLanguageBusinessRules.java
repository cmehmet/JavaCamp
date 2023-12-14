package Kodlama.io.Devs.business.rules;

import Kodlama.io.Devs.business.concretes.ProgrammingLanguageManager;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class ProgrammingLanguageBusinessRules {
    ProgrammingLanguageManager programmingLanguageManager = new ProgrammingLanguageManager();
	
	public static void isEmpty(ProgrammingLanguage programmingLanguage) throws Exception {
		if (programmingLanguage.getName().equals("")) {
			throw new Exception("Programlama dili boş geçilemez.");
		}
	}
	
	public static void isExists(ProgrammingLanguage programmingLanguage) throws Exception {
		for (ProgrammingLanguage programmingLanguageItem : programmingLanguageManager.) {
			if(programmingLanguageItem.getName().equals(programmingLanguage.getName())) {
				throw new Exception("Bu isimde bir kurs zaten mevcut.");
			}
		}
	}
}
