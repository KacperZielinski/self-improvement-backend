package pl.rest.crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pl.rest.crud.dto.SkillDto;
import pl.rest.crud.model.Skill;

@Mapper(componentModel = "spring")
public interface SkillMapper {

    @Mapping(source = "skill.skillPartList", target = "skillPartList")
    SkillDto toSkillDto(Skill skill);

    @Mapping(source = "skillDto.skillPartList", target = "skillPartList")
    Skill toSkill(SkillDto skillDto);
}
