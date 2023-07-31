package com.autoservice.controller;

import com.autoservice.model.InstallationOfSpareParts;
import com.autoservice.service.InstallationOfSparePartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/installation_of_spare_parts")
public class InstallationOfSparePartsController {

    private final InstallationOfSparePartsService installationOfSparePartsService;

    @Autowired
    public InstallationOfSparePartsController(InstallationOfSparePartsService installationOfSparePartsService) {
        this.installationOfSparePartsService = installationOfSparePartsService;
    }

    @PostMapping
    public void save(@RequestBody InstallationOfSpareParts installationOfSpareParts){
        installationOfSparePartsService.save(installationOfSpareParts);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id){
        InstallationOfSpareParts installationOfSpareParts = installationOfSparePartsService.getById(id);
        installationOfSparePartsService.delete(installationOfSpareParts);
    }

    @PutMapping
    public void update(@RequestBody InstallationOfSpareParts installationOfSpareParts){
        installationOfSparePartsService.save(installationOfSpareParts);
    }

    @GetMapping
    public InstallationOfSpareParts getById(@RequestParam("id") Long id){
        return installationOfSparePartsService.getById(id);
    }
}
