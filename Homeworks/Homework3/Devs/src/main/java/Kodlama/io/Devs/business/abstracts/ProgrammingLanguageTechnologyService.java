package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.business.requests.CreateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;

public interface ProgrammingLanguageTechnologyService {
	List<GetAllProgrammingLanguageTechnologiesResponse> getAll();
	GetByIdProgrammingLanguageTechnologyResponse getById(int id);
	void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest);
	void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest);
	void delete(int id);
}
