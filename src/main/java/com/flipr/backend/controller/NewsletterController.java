package com.flipr.backend.controller;

import com.flipr.backend.model.Newsletter;
import com.flipr.backend.repository.NewsletterRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newsletter")
@CrossOrigin(origins = "*")
public class NewsletterController {

    private final NewsletterRepository newsletterRepo;

    public NewsletterController(NewsletterRepository newsletterRepo) {
        this.newsletterRepo = newsletterRepo;
    }

    @PostMapping
    public Newsletter subscribe(@RequestBody Newsletter newsletter) {
        return newsletterRepo.save(newsletter);
    }

    @GetMapping
    public List<Newsletter> getAllSubscribers() {
        return newsletterRepo.findAll();
    }
}
