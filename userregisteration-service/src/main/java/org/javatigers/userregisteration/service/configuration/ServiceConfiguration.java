package org.javatigers.userregisteration.service.configuration;

import org.javatigers.userregisteration.dao.configuration.DatabaseConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 
 * @author sk
 *
 */
@Configuration
@Import(DatabaseConfiguration.class)
@ComponentScan(basePackages={"org.javatigers.userregisteration.service.user"})
public class ServiceConfiguration {

}
