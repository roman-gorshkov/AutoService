package com.autoservice.controller;

import com.autoservice.model.NewSpareParts;
import com.autoservice.service.NewSparePartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/new_spare_parts")
public class NewSparePartsController {

    private final NewSparePartsService newSparePartsService;

    @Autowired
    public NewSparePartsController(NewSparePartsService newSparePartsService) {
        this.newSparePartsService = newSparePartsService;
    }

    @PostMapping
    public void save(@RequestBody NewSpareParts newSpareParts){
        newSparePartsService.save(newSpareParts);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id){
        NewSpareParts newSpareParts = newSparePartsService.getById(id);
        newSparePartsService.delete(newSpareParts);
    }

    @PutMapping
    public void update(@RequestBody NewSpareParts newSpareParts){
        newSparePartsService.save(newSpareParts);
    }

    @GetMapping
    public NewSpareParts getById(@RequestParam("id") Long id){
        return newSparePartsService.getById(id);
    }

    @GetMapping("/getByNameOfProduct")
    public NewSpareParts getByNameOfProduct(@RequestParam("nameOfProduct") String nameOfProduct){
        return newSparePartsService.getByNameOfProduct(nameOfProduct);
    }
}
