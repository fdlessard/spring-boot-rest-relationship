package io.fdlessard.codebites.relationships.model;

import java.util.List;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "accountGroupProjection",
        types = {AccountGroup.class}
)
public interface AccountGroupProjection {

    Long getId();

    String getName();

    List<Account> getAccounts();

}