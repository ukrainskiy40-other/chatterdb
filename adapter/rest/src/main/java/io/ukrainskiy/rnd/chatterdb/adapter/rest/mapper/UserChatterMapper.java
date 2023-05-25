package io.ukrainskiy.rnd.chatterdb.adapter.rest.mapper;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.UserChatterEntity;
import io.ukrainskiy.rnd.chatterdb.adapter.rest.dto.UserChatterDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserChatterMapper {

    UserChatterDto toDto(UserChatterEntity entity);
}
