package org.javatigers.userregisteration.boot.configuration;

import org.javatigers.userregisteration.service.configuration.ServiceConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * Boot application
 * @author sk
 *
 */
@SpringBootApplication
@Import(ServiceConfiguration.class)
@ComponentScan(basePackages="org.javatigers.userregisteration.ws.configuration")
public class UserRegisterationBootConf {
	public static void main(String[] args) {
		SpringApplication.run(UserRegisterationBootConf.class, args);
	}

}
