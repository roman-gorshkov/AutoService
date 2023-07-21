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

    @PostMapping("/save")
    public void save(@RequestBody InstallationOfSpareParts installationOfSpareParts){
        installationOfSparePartsService.save(installationOfSpareParts);
    }

    @PostMapping("/delete")
    public void delete(@RequestBody InstallationOfSpareParts installationOfSpareParts){
        installationOfSparePartsService.delete(installationOfSpareParts);
    }

    @PostMapping("/update")
    public InstallationOfSpareParts update(@RequestBody InstallationOfSpareParts installationOfSpareParts){
        return installationOfSparePartsService.update(installationOfSpareParts);
    }

    @GetMapping("/getById")
    public InstallationOfSpareParts getById(@RequestParam("id") Long id){
        return installationOfSparePartsService.getById(id);
    }
}
