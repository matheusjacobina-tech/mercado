package com.mercadomvc.mercado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EntityScan(basePackages = "com.mercadomvc.mercado.model")
@ComponentScan(basePackages = {"com.mercadomvc.*"})
//@EnableJpaRepositories(basePackages = {"com.mercadomvc.mercado.repository"})
@EnableTransactionManagement
@EnableWebMvc
public class MercadoApplication {
	public static void main(String[] args) {
		SpringApplication.run(MercadoApplication.class, args);
	}
}
