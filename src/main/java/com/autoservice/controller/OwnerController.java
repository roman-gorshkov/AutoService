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

    @RequestMapping("/save")
    public void save(@RequestBody Owner owner){
        ownerService.save(owner);
    }

    @RequestMapping("/delete")
    public void delete(@RequestBody Owner owner){
        ownerService.delete(owner);
    }

    @RequestMapping("/update")
    public Owner update(@RequestBody Owner owner){
        return ownerService.update(owner);
    }

    @GetMapping("/getByNumberOfPhone")
    public Owner getByNumberOfPhone(@RequestParam String numberOfPhone){
        return ownerService.getByNumberOfPhone(numberOfPhone);
    }
}
