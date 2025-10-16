package com.app.backend.config;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

@Component
public class RestConfig implements RepositoryRestConfigurer {

    @Autowired
    private EntityManager entityManager;


    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        // Expose IDs for all entities
        config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
                .map(e -> e.getJavaType())
                .toArray(Class[]::new));
    }
}

