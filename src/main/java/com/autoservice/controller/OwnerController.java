package com.autoservice.controller;

import com.autoservice.model.Owner;
import com.autoservice.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/owner")
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @PostMapping
    public void save(@RequestBody Owner owner){
        ownerService.save(owner);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id){
        Owner owner = ownerService.getById(id);
        ownerService.delete(owner);
    }

    @PutMapping
    public void update(@RequestBody Owner owner){
        ownerService.save(owner);
    }

    @GetMapping
    public Owner getById(@RequestParam("id") Long id) {
        return ownerService.getById(id);
    }
    @GetMapping("/getByNumberOfPhone")
    public Owner getByNumberOfPhone(@RequestParam("numberOfPhone") String numberOfPhone){
        return ownerService.getByNumberOfPhone(numberOfPhone);
    }
}
