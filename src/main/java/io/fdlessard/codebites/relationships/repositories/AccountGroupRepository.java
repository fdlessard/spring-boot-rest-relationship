package io.fdlessard.codebites.relationships.repositories;

import io.fdlessard.codebites.relationships.model.AccountGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "account-groups")
public interface AccountGroupRepository extends PagingAndSortingRepository<AccountGroup, Long> {

}

