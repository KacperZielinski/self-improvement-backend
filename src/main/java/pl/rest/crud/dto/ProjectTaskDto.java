package pl.rest.crud.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProjectTaskDto implements Serializable {
    private static final long serialVersionUID = -323264206205986618L;

    private long id;
    private String task;
    private boolean isDone;
}
