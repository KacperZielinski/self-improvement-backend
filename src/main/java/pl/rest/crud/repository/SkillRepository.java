package pl.rest.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rest.crud.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
