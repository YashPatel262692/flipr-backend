package com.flipr.backend.repository;

import com.flipr.backend.model.Newsletter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NewsletterRepository extends MongoRepository<Newsletter, String> {
}
