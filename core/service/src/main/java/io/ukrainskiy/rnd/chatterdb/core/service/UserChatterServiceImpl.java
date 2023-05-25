package io.ukrainskiy.rnd.chatterdb.core.service;

import io.ukrainskiy.rnd.chatterdb.adapter.persistence.entity.UserChatterEntity;
import io.ukrainskiy.rnd.chatterdb.adapter.persistence.repository.UserChatterRepository;
import io.ukrainskiy.rnd.chatterdb.core.port.output.UserChatterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserChatterServiceImpl implements UserChatterService {

    private final UserChatterRepository userRepository;

    @Override
    public Flux<UserChatterEntity> findAllUser() {
        return userRepository.findAll();
    }
}
