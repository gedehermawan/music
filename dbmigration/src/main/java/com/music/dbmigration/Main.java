package com.music.dbmigration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import javax.sql.DataSource;

@SpringBootApplication
//@Import(FlywayConfiguration.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

  @Bean
  @ConfigurationProperties(prefix = "database")
  @Lazy
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }
}
