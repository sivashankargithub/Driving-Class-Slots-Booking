package pkg1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.Entity.StudentEntity;
import pkg1.Repository.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentRepo;
	
	@PostMapping("/addStudent")
	public StudentEntity addStudent(@RequestBody StudentEntity stuEntity) {
		return studentRepo.save(stuEntity);
	}
}