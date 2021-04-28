package io.fdlessard.codebites.relationships.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Table(name = "account_group", schema = "public")
@Entity
@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountGroup extends BaseEntity {

    @Column(name = "name")
    @Size(min = 2, message = "Name must have more thant 2 characters")
    private String name;

    @Valid
    @ManyToMany(mappedBy = "accountGroups")
    private List<Account> accounts;

}
