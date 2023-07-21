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

    @RequestMapping("/save")
    public void save(@RequestBody NewSpareParts newSpareParts){
        newSparePartsService.save(newSpareParts);
    }

    @RequestMapping("/delete")
    public void delete(@RequestBody NewSpareParts newSpareParts){
        newSparePartsService.delete(newSpareParts);
    }

    @RequestMapping("/update")
    public NewSpareParts update(@RequestBody NewSpareParts newSpareParts){
        return newSparePartsService.update(newSpareParts);
    }

    @GetMapping("/getById")
    public NewSpareParts getById(@RequestParam("id") Long id){
        return newSparePartsService.getById(id);
    }

    @GetMapping("/getByNameOfProduct")
    public NewSpareParts getByNameOfProduct(@RequestParam("nameOfProduct") String nameOfProduct){
        return newSparePartsService.getByNameOfProduct(nameOfProduct);
    }
}
