package io.fdlessard.codebites.relationships.model;

import java.util.List;
import org.springframework.data.rest.core.config.Projection;

@Projection(
        name = "accountProjection",
        types = {Account.class}
)
public interface AccountProjection {

    Long getId();

    String getLastName();

    String getFirstName();

    String getCompany();

    List<Address> getAddresses();

    List<AccountGroup> getAccountGroups();
}