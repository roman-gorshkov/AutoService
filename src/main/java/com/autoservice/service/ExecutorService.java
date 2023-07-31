package com.autoservice.service;

import com.autoservice.model.Executor;
import com.autoservice.repository.ExecutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExecutorService {
    private final ExecutorRepository executorRepository;

    @Autowired
    public ExecutorService(ExecutorRepository executorRepository) {
        this.executorRepository = executorRepository;
    }

    public void save(Executor executor){
        executorRepository.save(executor);
    }

    public void delete(Executor executor){
        executorRepository.delete(executor);
    }

    public Executor getById(Long id){
        return executorRepository.getById(id);
    }

    public Executor getByJobTitle(String jobTitle){
        return executorRepository.getByJobTitle(jobTitle);
    }
}
