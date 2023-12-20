package Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageTechnologyService;
import Kodlama.io.Devs.business.requests.CreateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.business.requests.UpdateProgrammingLanguageTechnologyRequest;
import Kodlama.io.Devs.business.responses.GetAllProgrammingLanguageTechnologiesResponse;
import Kodlama.io.Devs.business.responses.GetByIdProgrammingLanguageTechnologyResponse;

@RestController
@RequestMapping("/api/programminglanguagetechnologies")
public class ProgrammingLanguageTechnologiesController {
	private ProgrammingLanguageTechnologyService programmingLanguageTechnologyService;

	@Autowired
	public ProgrammingLanguageTechnologiesController(ProgrammingLanguageTechnologyService programmingLanguageTechnologyService) {
		this.programmingLanguageTechnologyService = programmingLanguageTechnologyService;
	}
	
	@GetMapping()
	public List<GetAllProgrammingLanguageTechnologiesResponse> getAll(){
		return programmingLanguageTechnologyService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdProgrammingLanguageTechnologyResponse getById(@PathVariable() int id) {
		return programmingLanguageTechnologyService.getById(id);
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) {
		programmingLanguageTechnologyService.add(createProgrammingLanguageTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody() UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		programmingLanguageTechnologyService.update(updateProgrammingLanguageTechnologyRequest);
	}
	
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		programmingLanguageTechnologyService.delete(id);
	}
	
	
	
}
