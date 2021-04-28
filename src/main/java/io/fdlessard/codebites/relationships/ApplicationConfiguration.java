package io.fdlessard.codebites.relationships;

import io.fdlessard.codebites.relationships.model.Account;
import io.fdlessard.codebites.relationships.model.AccountGroup;
import io.fdlessard.codebites.relationships.model.Address;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
@Configuration
public class ApplicationConfiguration implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(AccountGroup.class, Account.class, Address.class);
    }
}

