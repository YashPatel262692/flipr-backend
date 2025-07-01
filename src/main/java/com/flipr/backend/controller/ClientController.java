package com.flipr.backend.controller;

import com.flipr.backend.model.Client;
import com.flipr.backend.repository.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
@CrossOrigin(origins = "*")
public class ClientController {

    private final ClientRepository clientRepo;

    public ClientController(ClientRepository clientRepo) {
        this.clientRepo = clientRepo;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientRepo.findAll();
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        return clientRepo.save(client);
    }
}
