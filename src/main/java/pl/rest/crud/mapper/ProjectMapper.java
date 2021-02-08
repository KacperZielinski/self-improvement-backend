package pl.rest.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.rest.crud.dto.ProjectDto;
import pl.rest.crud.model.Project;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    @Mapping(source = "project.projectTasks", target = "projectTaskDtoList")
    ProjectDto toProjectDto(Project project);

    @Mapping(source = "projectDto.projectTaskDtoList", target = "projectTasks")
    Project toProject(ProjectDto projectDto);
}
