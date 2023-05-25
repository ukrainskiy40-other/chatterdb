package io.ukrainskiy.rnd.chatterdb.adapter.persistence.config;

import javax.annotation.PostConstruct;

import com.zaxxer.hikari.HikariDataSource;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class HikariCPPoolCloser {

    private final HikariDataSource hikariDataSource;

    @PostConstruct
    public void close() {
        hikariDataSource.close();
    }
}
