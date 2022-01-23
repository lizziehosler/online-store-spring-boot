package com.training.ecommerce.repository;

import com.training.ecommerce.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "genre", path = "genre")
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
