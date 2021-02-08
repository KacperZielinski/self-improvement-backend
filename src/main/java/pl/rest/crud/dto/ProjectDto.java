package pl.rest.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ProjectDto implements Serializable {
    private static final long serialVersionUID = 7421502459856406810L;

    private long id;
    private String name;

    @JsonProperty("tasks")
    private List<ProjectTaskDto> projectTaskDtoList;
}
