package com.mipresupuesto.personalbudget.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.mipresupuesto.personalbudget.vault.ConfigVault;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mipresupuesto.personalbudget" })
@EnableJpaRepositories(basePackages = { "com.mipresupuesto.personalbudget" })
@EntityScan(basePackages = { "com.mipresupuesto.personalbudget" })
@EnableConfigurationProperties(ConfigVault.class)
public class PersonalBudgetApiApplication implements CommandLineRunner {

	private final ConfigVault configuration;

	public PersonalBudgetApiApplication(ConfigVault configuration) {
		this.configuration = configuration;
	}

	public static void main(String[] args) {
		SpringApplication.run(PersonalBudgetApiApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Logger logger = LoggerFactory.getLogger(PersonalBudgetApiApplication.class);

		logger.info("----------------------------------------");
		logger.info("Configuration properties");
		logger.info("   password is {}", configuration.getUrl());
		logger.info("   username is {}", configuration.getUsername());
		logger.info("   password is {}", configuration.getPassword());
		logger.info("----------------------------------------");
	}

}
