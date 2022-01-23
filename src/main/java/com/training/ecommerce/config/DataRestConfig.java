package com.training.ecommerce.config;

import com.training.ecommerce.entity.Book;
import com.training.ecommerce.entity.Genre;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class DataRestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] unsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
        config.getExposureConfiguration()
            .forDomainType(Book.class)
            .withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions))
            .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions));

        config.getExposureConfiguration()
            .forDomainType(Genre.class)
            .withItemExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions))
            .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(unsupportedActions));
    }
}
