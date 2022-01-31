package com.training.ecommerce.repository;

import com.training.ecommerce.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "genre", path = "genre")
public interface GenreRepository extends JpaRepository<Genre, Long> {
}
