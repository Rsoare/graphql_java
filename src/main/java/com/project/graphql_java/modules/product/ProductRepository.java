package com.project.graphql_java.modules.product;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {

}
