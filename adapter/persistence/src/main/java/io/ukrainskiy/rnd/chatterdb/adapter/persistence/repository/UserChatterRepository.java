package io.ukrainskiy.rnd.chatterdb.adapter.persistence.repository;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.UserChatterEntity;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface UserChatterRepository extends ReactiveSortingRepository<UserChatterEntity, Long> {
}
