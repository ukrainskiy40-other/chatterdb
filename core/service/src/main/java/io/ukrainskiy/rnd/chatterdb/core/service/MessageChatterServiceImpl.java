package io.ukrainskiy.rnd.chatterdb.core.service;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.MessageChatterEntity;
import io.ukrainskiy.rnd.chatterdb.adapter.persistence.repository.MessageChatterRepository;

import io.ukrainskiy.rnd.chatterdb.core.port.output.MessageChatterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class MessageChatterServiceImpl implements MessageChatterService {

    private final MessageChatterRepository messageRepo;

    @Override
    public Flux<MessageChatterEntity> findAll() {
        return messageRepo.findAll();
    }

}
