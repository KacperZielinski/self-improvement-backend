package pl.rest.crud.service;

import org.springframework.stereotype.Service;
import pl.rest.crud.dto.SkillDto;
import pl.rest.crud.mapper.SkillMapper;
import pl.rest.crud.repository.SkillRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkillService {

    private SkillRepository skillRepository;
    private SkillMapper skillMapper;

    public SkillService(SkillRepository skillRepository, SkillMapper skillMapper) {
        this.skillRepository = skillRepository;
        this.skillMapper = skillMapper;
    }

    public List<SkillDto> getAllSkills() {
        return skillRepository
                .findAll()
                .stream()
                .map(skillMapper::toSkillDto)
                .collect(Collectors.toList());
    }

    public SkillDto getSkillById(long id) {
        return skillRepository
                .findById(id)
                .map(skillMapper::toSkillDto)
                .orElseThrow(() -> new EntityNotFoundException("Skill of id: " + id + " not exists!"));
    }

    public void addNewSkill(SkillDto skillDto) {
        skillRepository.save(skillMapper.toSkill(skillDto));
    }
}
