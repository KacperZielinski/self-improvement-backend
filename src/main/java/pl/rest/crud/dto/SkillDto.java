package pl.rest.crud.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class SkillDto implements Serializable {
    private static final long serialVersionUID = 2471539214785929291L;

    private long id;
    private String skillName;
    private int skillType;

    @JsonProperty("skills")
    private List<SkillPartDto> skillPartList;
}
