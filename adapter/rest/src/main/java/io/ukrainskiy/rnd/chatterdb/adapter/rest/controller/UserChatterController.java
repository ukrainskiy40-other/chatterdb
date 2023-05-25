package io.ukrainskiy.rnd.chatterdb.adapter.rest.controller;

import io.ukrainskiy.rnd.chatterdb.adapter.rest.adapter.UserChatterAdapter;
import io.ukrainskiy.rnd.chatterdb.adapter.rest.dto.UserChatterDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
public class UserChatterController {

    private final UserChatterAdapter userChatterAdapter;


    @GetMapping("/api/v1/users")
    public Flux<UserChatterDto> findAllUsers() {
        return userChatterAdapter.findAllUser();
    }
}
