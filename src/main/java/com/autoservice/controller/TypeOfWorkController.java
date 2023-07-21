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

    @PostMapping("/save")
    public void save(@RequestBody TypeOfWork typeOfWork){
        typeOfWorkService.save(typeOfWork);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody TypeOfWork typeOfWork){
        typeOfWorkService.delete(typeOfWork);
    }

    @PostMapping("/update")
    public TypeOfWork update(@RequestBody TypeOfWork typeOfWork){
        return typeOfWorkService.update(typeOfWork);
    }

    @GetMapping("/getById")
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
