package io.fdlessard.codebites.relationships.model;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(
        name = "accountGroupProjection",
        types = {AccountGroup.class}
)
public interface AccountGroupProjection {

    Long getId();

    String getName();

    List<Account> getAccounts();

}