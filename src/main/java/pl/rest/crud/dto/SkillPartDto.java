package pl.rest.crud.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SkillPartDto implements Serializable {
    private static final long serialVersionUID = 2471312314785929291L;

    private long id;
    private String task;
    private boolean isDone;
}
