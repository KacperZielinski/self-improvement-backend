package pl.rest.crud.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class SkillDto implements Serializable {
    private static final long serialVersionUID = 2471539214785929291L;

    private long id;
    private String skillName;
    private int skillType;
}
