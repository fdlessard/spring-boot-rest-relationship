package io.fdlessard.codebites.relationships.model;

import org.springframework.data.rest.core.config.Projection;

import java.util.List;

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