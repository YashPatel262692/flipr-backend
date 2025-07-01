package com.flipr.backend.controller;

import com.flipr.backend.model.Project;
import com.flipr.backend.repository.ProjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*") // Allow frontend to access backend
public class ProjectController {

    private final ProjectRepository projectRepo;

    public ProjectController(ProjectRepository projectRepo) {
        this.projectRepo = projectRepo;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    @PostMapping
    public Project addProject(@RequestBody Project project) {
        return projectRepo.save(project);
    }
}
