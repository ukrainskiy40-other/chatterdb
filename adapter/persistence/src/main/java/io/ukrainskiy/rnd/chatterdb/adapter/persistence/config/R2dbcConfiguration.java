package io.ukrainskiy.rnd.chatterdb.adapter.persistence.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories("io.ukrainskiy.rnd.chatterdb.adapter.persistence")
@Configuration
public class R2dbcConfiguration {
}
