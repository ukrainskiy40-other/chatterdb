package io.ukrainskiy.rnd.chatterdb.adapter.rest.adapter;

import io.ukrainskiy.rnd.chatterdb.adapter.rest.dto.UserChatterDto;
import io.ukrainskiy.rnd.chatterdb.adapter.rest.mapper.UserChatterMapper;
import io.ukrainskiy.rnd.chatterdb.core.port.output.UserChatterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class UserChatterAdapter {

    private final UserChatterService userChatterService;
    private final UserChatterMapper userChatterMapper;

    public Flux<UserChatterDto> findAllUser() {
        return userChatterService.findAllUser().map(userChatterMapper::toDto);
    }
}
