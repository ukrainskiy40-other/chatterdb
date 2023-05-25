package io.ukrainskiy.rnd.chatterdb.core.port.output;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.UserChatterEntity;
import reactor.core.publisher.Flux;

public interface UserChatterService {

    Flux<UserChatterEntity> findAllUser();
}
