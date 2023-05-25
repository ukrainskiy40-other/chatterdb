package io.ukrainskiy.rnd.chatterdb.adapter.persistence.repository;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.MessageChatterEntity;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface MessageChatterRepository extends ReactiveSortingRepository<MessageChatterEntity, Long> {
}
