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

    @PostMapping("/save")
    public void save(@RequestBody Executor executor){
        executorService.save(executor);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody Executor executor){
        executorService.delete(executor);
    }

    @PostMapping("/update")
    public Executor update(@RequestBody Executor executor){
        return executorService.update(executor);
    }

    @GetMapping("/getById")
    public Executor getById(@RequestParam("id") Long id){
        return executorService.getById(id);
    }

    @GetMapping("/getByJobTitle")
    public Executor getByJobTitle(@RequestParam("getByJobTitle") String jobTitle){
        return executorService.getByJobTitle(jobTitle);
    }
}
