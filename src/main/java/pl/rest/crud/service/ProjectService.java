package pl.rest.crud.service;

import org.springframework.stereotype.Service;
import pl.rest.crud.dto.ProjectDto;
import pl.rest.crud.mapper.ProjectMapper;
import pl.rest.crud.repository.ProjectRepository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    public ProjectService(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    public List<ProjectDto> getAllProjects() {
        return projectRepository
                .findAll()
                .stream()
                .map(projectMapper::toProjectDto)
                .collect(Collectors.toList());
    }

    public ProjectDto getProjectById(long id) {
        return projectRepository
                .findById(id)
                .map(projectMapper::toProjectDto)
                .orElseThrow(() -> new EntityNotFoundException("Project of id: " + id + " not exists!"));
    }

    public void addNewProject(ProjectDto project) {
        projectRepository.save(projectMapper.toProject(project));
    }
}
