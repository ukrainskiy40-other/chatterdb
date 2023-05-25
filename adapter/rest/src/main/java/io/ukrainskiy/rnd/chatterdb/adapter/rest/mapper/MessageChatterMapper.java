package io.ukrainskiy.rnd.chatterdb.adapter.rest.mapper;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.MessageChatterEntity;
import io.ukrainskiy.rnd.chatterdb.adapter.rest.dto.MessageChatterDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MessageChatterMapper {

    MessageChatterDto toDto(MessageChatterEntity entity);
    List<MessageChatterDto> toListDto(List<MessageChatterEntity> entities);
}
