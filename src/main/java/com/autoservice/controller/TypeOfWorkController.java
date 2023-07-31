package com.autoservice.controller;

import com.autoservice.model.TypeOfWork;
import com.autoservice.service.TypeOfWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/type_of_work")
public class TypeOfWorkController {

    private final TypeOfWorkService typeOfWorkService;

    @Autowired
    public TypeOfWorkController(TypeOfWorkService typeOfWorkService) {
        this.typeOfWorkService = typeOfWorkService;
    }

    @PostMapping
    public void save(@RequestBody TypeOfWork typeOfWork){
        typeOfWorkService.save(typeOfWork);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id){
        TypeOfWork typeOfWork = typeOfWorkService.getById(id);
        typeOfWorkService.delete(typeOfWork);
    }

    @PutMapping
    public void update(@RequestBody TypeOfWork typeOfWork){
        typeOfWorkService.save(typeOfWork);
    }

    @GetMapping
    public TypeOfWork getById(@RequestParam("id") Long id){
        return typeOfWorkService.getById(id);
    }

    @GetMapping("/getByWorkType")
    public TypeOfWork getByWorkType(@RequestParam("workType") String workType){
        return typeOfWorkService.getByWorkType(workType);
    }

    @GetMapping("/getByDeadLine")
    public TypeOfWork getByDeadLine(@RequestParam("deadLine") String deadLine){
        return typeOfWorkService.getByDeadLine(deadLine);
    }
}
