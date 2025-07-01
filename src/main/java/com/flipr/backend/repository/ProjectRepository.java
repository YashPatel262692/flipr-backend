package com.flipr.backend.repository;

import com.flipr.backend.model.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
    boolean existsByName(String name);

}
