package com.music.dbmigration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

import javax.sql.DataSource;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
//@Import(FlywayConfiguration.class)
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Main {
  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }

//  @Bean
//  @ConfigurationProperties(prefix = "database")
//  @Lazy
//  public DataSource dataSource() {
//    return DataSourceBuilder.create().build();
//  }

  @Bean
  public BasicDataSource dataSource() throws URISyntaxException {
    URI dbUri = new URI(System.getenv("DATABASE_URL"));

    String username = dbUri.getUserInfo().split(":")[0];
    String password = dbUri.getUserInfo().split(":")[1];
    String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + ':' + dbUri.getPort() + dbUri.getPath();

    BasicDataSource basicDataSource = new BasicDataSource();
    basicDataSource.setUrl(dbUrl);
    basicDataSource.setUsername(username);
    basicDataSource.setPassword(password);

    return basicDataSource;
  }
}
