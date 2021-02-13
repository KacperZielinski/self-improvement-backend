package pl.rest.crud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.rest.crud.dto.ProjectDto;
import pl.rest.crud.service.ProjectService;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectApi {

    private ProjectService projectService;

    public ProjectApi(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectDto> getAllSkills() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public ProjectDto getProjectById(@PathVariable("id") Long projectId) {
        return projectService.getProjectById(projectId);
    }

    @PostMapping
    public void addNewSkill(@RequestBody ProjectDto project) {
        projectService.addNewProject(project);
    }
}
