package pkg1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pkg1.Entity.TeacherEntity;
import pkg1.Repository.TeacherRepo;

@RestController
public class TeacherCon {
	@Autowired
	TeacherRepo teacherRepo;
	@PostMapping("/addTeacher")
	public TeacherEntity addTeacher(@RequestBody TeacherEntity teacherEntity) {
		teacherRepo.save(teacherEntity);
		return teacherEntity;
	}
}
