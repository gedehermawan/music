package com.syeftipay.dbmigration;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Migration implements CommandLineRunner {

  @Autowired
  Flyway flyway;

  @Override
  public void run(String... args) throws Exception {
    flyway.migrate();
  }
}