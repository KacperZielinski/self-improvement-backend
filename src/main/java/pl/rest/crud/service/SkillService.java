package pl.rest.crud.service;

import org.springframework.stereotype.Service;
import pl.rest.crud.dto.SkillDto;
import pl.rest.crud.mapper.SkillMapper;
import pl.rest.crud.model.Skill;
import pl.rest.crud.repository.SkillRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class SkillService {

    private SkillRepository skillRepository;
    private SkillMapper skillMapper;

    public SkillService(SkillRepository skillRepository, SkillMapper skillMapper) {
        this.skillRepository = skillRepository;
        this.skillMapper = skillMapper;
    }

    public List<SkillDto> getAllSkills() {
        return Arrays.asList(skillMapper.toSkillDto(Skill.builder()
                .id(1L)
                .skillName("Really dummy..")
                .skillType(2)
                .build()
        ));
    }
}
