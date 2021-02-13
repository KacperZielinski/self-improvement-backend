package pl.rest.crud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rest.crud.dto.SkillDto;
import pl.rest.crud.service.SkillService;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillApi {

    private SkillService skillService;

    public SkillApi(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public List<SkillDto> getAllSkills() {
        return skillService.getAllSkills();
    }

    @GetMapping("/{id}")
    public SkillDto getSkillById(@PathVariable("id") Long skillId) {
        return skillService.getSkillById(skillId);
    }

    @PostMapping
    public void addNewSkill(@RequestBody SkillDto skill) {
        skillService.addNewSkill(skill);
    }
}
