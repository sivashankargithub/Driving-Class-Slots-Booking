package pkg1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pkg1.Entity.TeacherEntity;
import pkg1.Repository.TeacherRepo;

@RestController
public class TeacherCon {
	@Autowired
	TeacherRepo teacherRepo;
	
	@PostMapping("/addTeacher")
	public TeacherEntity addTeacher(@RequestBody TeacherEntity teacherEntity) {
		return teacherRepo.save(teacherEntity);
	}
	
	@GetMapping("/getAllTeachers")
	public List<TeacherEntity> getAllTeacher(){
		return teacherRepo.findAll();
	}
	
	@GetMapping("/findTeacherById/{id}")
	public Optional<TeacherEntity> findTeacherById(@PathVariable int id){
		return teacherRepo.findById(id);
	}
}
