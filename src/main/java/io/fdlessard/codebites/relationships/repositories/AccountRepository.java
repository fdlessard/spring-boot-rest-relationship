package io.fdlessard.codebites.relationships.repositories;

import io.fdlessard.codebites.relationships.model.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "accounts")
public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {

    Page<Account> findByLastName(@Param("lastName") String lastName, Pageable p);

    Page<Account> findByFirstName(@Param("firstName") String firstName, Pageable p);
}