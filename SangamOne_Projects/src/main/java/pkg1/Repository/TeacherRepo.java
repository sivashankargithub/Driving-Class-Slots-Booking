package pkg1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.Entity.TeacherEntity;

public interface TeacherRepo extends JpaRepository<TeacherEntity, Integer>{
}
