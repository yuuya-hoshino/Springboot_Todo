package com.example.myapp;

import org.flywaydb.core.Flyway;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FlywayMigration implements CommandLineRunner {

    private final Flyway flyway;

    public FlywayMigration(Flyway flyway) {
        this.flyway = flyway;
    }

    @Override
    public void run(String... args) {
        flyway.migrate();
    }
}
