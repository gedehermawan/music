package com.syeftipay.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan({"com.syeftipay.api","com.syeftipay.backend"})
@EntityScan("com.syeftipay.backend.domain")
@EnableJpaRepositories("com.syeftipay.backend.repository")
public class SpringConfiguration {
  @Bean
  @Primary
  @ConfigurationProperties(prefix = "database")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  @Primary
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(
      EntityManagerFactoryBuilder builder, DataSource dataSource) {
    return builder
        .dataSource(dataSource)
        .packages("com.syeftipay.backend")
        .persistenceUnit("syeftipay")
        .build();
  }

  @Bean
  @Primary
  public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
    return new JpaTransactionManager(entityManagerFactory);
  }
}

