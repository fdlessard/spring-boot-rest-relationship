# spring-boot-rest-relationship

Note: 
In pure JPA it is preferable to use Sets instead of Lists. But when JPA is used with SpringBoot @RepositoryRestResource
the bidirectional relationship only works with List. If Set is used, we have infinite recursive stacktrace


Anyway to use Sets with bidirectional relationships and @RepositoryRestResource


# Test Urls

GET http://localhost:8080/accounts
GET http://localhost:8080/account-groups
GET http://localhost:8080/accounts/1
GET http://localhost:8080/account-groups/1
GET http://localhost:8080/accounts/1?projection=accountProjection
GET http://localhost:8080/account-groups/1?projection=accountGroupProjection

GET http://localhost:8080/account-groups/1/accounts

PATCH http://localhost:8080/account-groups/1/accounts
Content-Type: text/uri-list
Body: /accounts/3
DELETE http://localhost:8080/account-groups/1/accounts/3

PUT http://localhost:8080/account-groups/1/accounts
Content-Type: text/uri-list
Body: /accounts/1
      /accounts/2




# References

https://stackoverflow.com/questions/26259474/how-to-add-elements-in-a-many-to-many-relationship-via-springs-repositoryrestr/54329609
https://reflectoring.io/relations-with-spring-data-rest/
https://stackoverflow.com/questions/35910850/spring-boot-data-rest-post-returns-204-but-only-selects
https://www.baeldung.com/spring-data-rest-relationships

https://github.com/spring-projects/spring-data-rest/issues/1157
https://www.programmersought.com/article/16094609079/
https://stackoverflow.com/questions/26259474/how-to-add-elements-in-a-many-to-many-relationship-via-springs-repositoryrestr/54329609
https://stackoverflow.com/questions/39057338/spring-data-rest-posting-a-new-item-with-manytomany-relationship
https://stackoverflow.com/questions/59343918/jpa-data-not-getting-saved-in-mapped-entity-while-using-many-to-many-relations
https://stackoverflow.com/questions/44811394/spring-data-rest-multiple-repositories-reusing-entities
https://stackoverflow.com/questions/60652031/put-on-manytomany-association-in-spring-data-rest


https://www.baeldung.com/jpa-many-to-many
https://vladmihalcea.com/the-best-way-to-use-the-manytomany-annotation-with-jpa-and-hibernate/
https://dzone.com/articles/introduction-to-spring-data-jpa-part-8-many-to-man
