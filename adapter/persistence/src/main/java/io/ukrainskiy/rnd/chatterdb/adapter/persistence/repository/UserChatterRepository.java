package io.ukrainskiy.rnd.chatterdb.adapter.persistence.repository;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.UserChatterEntity;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Flux;

public interface UserChatterRepository extends ReactiveSortingRepository<UserChatterEntity, Long> {
    Flux<UserChatterEntity> findAll();
}
