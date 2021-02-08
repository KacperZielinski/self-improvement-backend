package pl.rest.crud.service;

import org.springframework.stereotype.Service;
import pl.rest.crud.dto.SkillDto;
import pl.rest.crud.mapper.SkillMapper;
import pl.rest.crud.model.Skill;
import pl.rest.crud.repository.SkillRepository;

@Service
public class SkillService {

    private SkillRepository skillRepository;
    private SkillMapper skillMapper;

    public SkillService(SkillRepository skillRepository, SkillMapper skillMapper) {
        this.skillRepository = skillRepository;
        this.skillMapper = skillMapper;
    }

    public SkillDto getAllSkills() {
        return skillMapper.toSkillDto(Skill.builder()
                .id(1L)
                .skillType(13)
                .skillName("Really dummy..")
                .build()
        );
    }
}
