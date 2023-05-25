package io.ukrainskiy.rnd.chatterdb.adapter.rest.controller;

import io.ukrainskiy.rnd.chatterdb.adapter.rest.adapter.MessageChatterAdapter;
import io.ukrainskiy.rnd.chatterdb.adapter.rest.dto.MessageChatterDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@RestController
public class MessageChatterController {

    private final MessageChatterAdapter messageChatterAdapter;

    @GetMapping("/api/v1/messages")
    public Flux<MessageChatterDto> findAllMessage() {
        return messageChatterAdapter.findAllMessage();
    }
}
