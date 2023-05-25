package io.ukrainskiy.rnd.chatterdb.adapter.rest.adapter;

import io.ukrainskiy.rnd.chatterdb.adapter.rest.mapper.MessageChatterMapper;
import io.ukrainskiy.rnd.chatterdb.adapter.rest.dto.MessageChatterDto;
import io.ukrainskiy.rnd.chatterdb.core.port.output.MessageChatterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class MessageChatterAdapter {

    private final MessageChatterService messageService;
    private final MessageChatterMapper mapper;

    public Flux<MessageChatterDto> findAllMessage() {
        return messageService.findAll().map(mapper::toDto);
    }
}
