package com.autoservice.controller;

import com.autoservice.model.Executor;
import com.autoservice.service.ExecutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/executor")
public class ExecutorController {
    private final ExecutorService executorService;

    @Autowired
    public ExecutorController(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @PostMapping
    public void save(@RequestBody Executor executor){
        executorService.save(executor);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id){
        Executor executor = executorService.getById(id);
        executorService.delete(executor);
    }

    @PutMapping
    public void update(@RequestBody Executor executor){
        executorService.save(executor);
    }

    @GetMapping
    public Executor getById(@RequestParam("id") Long id){
        return executorService.getById(id);
    }

    @GetMapping("/getByJobTitle")
    public Executor getByJobTitle(@RequestParam("jobTitle") String jobTitle){
        return executorService.getByJobTitle(jobTitle);
    }
}
