package com.autoservice.repository;

import com.autoservice.model.Executor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExecutorRepository extends JpaRepository <Executor,Long> {
    Executor getById(Long id);
    Executor getByJobTitle(String jobTitle);
    Executor update(Executor executor);
}
