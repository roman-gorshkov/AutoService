package com.autoservice.service;

import com.autoservice.model.TypeOfWork;
import com.autoservice.repository.TypeOfWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeOfWorkService {

    private final TypeOfWorkRepository typeOfWorkRepository;

    @Autowired
    public TypeOfWorkService(TypeOfWorkRepository typeOfWorkRepository) {
        this.typeOfWorkRepository = typeOfWorkRepository;
    }

    public void save(TypeOfWork typeOfWork){
        typeOfWorkRepository.save(typeOfWork);
    }

    public void delete(TypeOfWork typeOfWork){
        typeOfWorkRepository.delete(typeOfWork);
    }

    public TypeOfWork update(TypeOfWork typeOfWork){
        return typeOfWorkRepository.update(typeOfWork);
    }

    public TypeOfWork getById(Long id){
        return typeOfWorkRepository.getById(id);
    }

    public TypeOfWork getByWorkType(String workType){
        return typeOfWorkRepository.getByWorkType(workType);
    }

    public TypeOfWork getByDeadLine(String deadLine){
        return typeOfWorkRepository.getByDeadLine(deadLine);
    }
}
