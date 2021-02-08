package pl.rest.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rest.crud.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
