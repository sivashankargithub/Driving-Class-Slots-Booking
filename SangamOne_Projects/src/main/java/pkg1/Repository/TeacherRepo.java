package pkg1.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pkg1.Entity.TeacherEntity;
@Repository
public interface TeacherRepo extends CrudRepository<TeacherEntity, Integer> {
}
