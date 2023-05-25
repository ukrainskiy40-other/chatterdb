package io.ukrainskiy.rnd.chatterdb.core.port.output;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.MessageChatterEntity;
import reactor.core.publisher.Flux;


public interface MessageChatterService {

    Flux<MessageChatterEntity> findAll();
}
