package pkg1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.Entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
