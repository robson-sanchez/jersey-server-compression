package br.com.rvvsanchez.libs.api.rest.server.jersey;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

import br.com.rvvsanchez.libs.api.rest.server.jaxrs.CompressionDynamicBinding;
import br.com.rvvsanchez.libs.api.rest.server.jaxrs.ObjectMapperProvider;

/**
 * The resource configuration for configuring a web application.
 * 
 * @author robson-sanchez
 */
public class JerseyConfig extends ResourceConfig {

  public JerseyConfig(String... packages) {
    register(CompressionDynamicBinding.class);
    register(ObjectMapperProvider.class);
    register(JacksonFeature.class);
    packages(packages);
  }

}
