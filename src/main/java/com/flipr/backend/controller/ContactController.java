package com.flipr.backend.controller;

import com.flipr.backend.model.Contact;
import com.flipr.backend.repository.ContactRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = "*")
public class ContactController {

    private final ContactRepository contactRepo;

    public ContactController(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    @PostMapping
    public Contact submitContact(@RequestBody Contact contact) {
        return contactRepo.save(contact);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepo.findAll();
    }
}
