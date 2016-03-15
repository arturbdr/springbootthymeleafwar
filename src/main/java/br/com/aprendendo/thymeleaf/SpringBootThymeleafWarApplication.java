package br.com.aprendendo.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootThymeleafWarApplication extends SpringBootServletInitializer{

	/**
	 * Utilizado quando o projeto for um JAR	
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootThymeleafWarApplication.class, args);
	}
	
	
	/**
	 * Utilizado quando o projeto for um WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringBootThymeleafWarApplication.class);
	}
}
