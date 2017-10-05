package org.javatigers.userregisteration.ws.configuration;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;





/**
 * Rest API Configuration
 * @author sk
 *
 */
@Component
@ApplicationPath("/api/v1")
public class WSConfiguration extends ResourceConfig {

	public WSConfiguration(ObjectMapper objectMapper) {
		packages("org.javatigers.userregisteration.ws.user");
		register(new ObjectMapperContextResolver(objectMapper));
	}

	@Provider
	public static class ObjectMapperContextResolver implements ContextResolver<ObjectMapper> {

		private final ObjectMapper mapper;

		public ObjectMapperContextResolver(ObjectMapper mapper) {
			this.mapper = mapper;
		}

		@Override
		public ObjectMapper getContext(Class<?> type) {
			return mapper;
		}
	}

}
