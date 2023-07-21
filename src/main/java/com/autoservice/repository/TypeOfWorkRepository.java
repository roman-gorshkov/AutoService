package com.autoservice.repository;

import com.autoservice.model.TypeOfWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOfWorkRepository extends JpaRepository <TypeOfWork,Long> {
    TypeOfWork getById(Long id);
    TypeOfWork getByWorkType(String workType);
    TypeOfWork getByDeadLine(String deadLine);
    TypeOfWork update(TypeOfWork typeOfWork);
}
