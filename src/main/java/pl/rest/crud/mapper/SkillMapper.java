package pl.rest.crud.mapper;

import org.mapstruct.Mapper;
import pl.rest.crud.dto.SkillDto;
import pl.rest.crud.model.Skill;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillDto toSkillDto(Skill skill);

    Skill toSkill(SkillDto skillDto);
}
