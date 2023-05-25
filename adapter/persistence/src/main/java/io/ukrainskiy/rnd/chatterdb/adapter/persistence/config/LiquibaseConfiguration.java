package io.ukrainskiy.rnd.chatterdb.adapter.persistence.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import io.ukrainskiy.rnd.chatterdb.adapter.persistence.util.DatabaseURLUtil;
import liquibase.integration.spring.SpringLiquibase;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.env.Environment;

import java.util.Optional;

@Configuration
public class LiquibaseConfiguration {

    @Bean
    public SpringLiquibase springLiquibase(HikariDataSource hikariDataSource, R2dbcProperties r2dbcProperties, Environment environment) {
        var springLiquibase = new SpringLiquibase();

        var springLiquibaseChangeLogProperty = Optional.ofNullable(environment.getProperty("spring.liquibase.changelog")).orElse("");
        springLiquibase.setChangeLog(springLiquibaseChangeLogProperty);
        springLiquibase.setDataSource(hikariDataSource);
        springLiquibase.setLiquibaseSchema(DatabaseURLUtil.getSchemaFromUrl(r2dbcProperties.getUrl()));


        return springLiquibase;
    }

    @Bean
    @DependsOn("springLiquibase")
    public HikariCPPoolCloser hikariCPPoolCloser(HikariDataSource hikariDataSource) {
        return new HikariCPPoolCloser(hikariDataSource);
    }

    @Bean
    public HikariDataSource prepareLiquibaseDataSource(R2dbcProperties r2dbcProperties) {
        var hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(DatabaseURLUtil.replaceR2dbcToJdbc(r2dbcProperties.getUrl()));
        hikariConfig.setDriverClassName("org.postgresql.Driver");

        hikariConfig.setSchema(DatabaseURLUtil.getSchemaFromUrl(r2dbcProperties.getUrl()));
        hikariConfig.setUsername(r2dbcProperties.getUsername());
        hikariConfig.setPassword(r2dbcProperties.getPassword());

        return new HikariDataSource(hikariConfig);
    }
}
