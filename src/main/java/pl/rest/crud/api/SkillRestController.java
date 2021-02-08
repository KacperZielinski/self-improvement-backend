package pl.rest.crud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rest.crud.dto.SkillDto;
import pl.rest.crud.service.SkillService;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillRestController {

    private SkillService skillService;

    public SkillRestController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping
    public List<SkillDto> getAllSkills() {
        return skillService.getAllSkills();
    }
}
