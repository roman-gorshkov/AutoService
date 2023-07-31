package com.autoservice.controller;


import com.autoservice.model.Automobile;
import com.autoservice.service.AutomobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/automobile")
public class AutomobileController {

    private final AutomobileService automobileService;

    @Autowired
    public AutomobileController(AutomobileService automobileService) {
        this.automobileService = automobileService;
    }

    @PostMapping()
    public void save(@RequestBody Automobile automobile){
        automobileService.save(automobile);
    }

    @DeleteMapping()
    public void delete(@RequestParam("id") Long id){
        Automobile automobile = automobileService.getById(id);
        automobileService.delete(automobile);
    }

    @PutMapping()
    public void update(@RequestBody Automobile automobile){
        automobileService.save(automobile);
    }

    @GetMapping()
    public Automobile getById(@RequestParam("id") Long id){
        return automobileService.getById(id);
    }

    @GetMapping("/getByLicensePlate")
    public Automobile getByLicensePlate(@RequestParam("licensePlate") String licensePlate){
        return automobileService.getByLicensePlate(licensePlate);
    }

    @GetMapping("/getByVINNumber")
    public Automobile getByVINNumber(@RequestParam("VINNumber") String VINNumber){
        return automobileService.getByVINNumber(VINNumber);
    }

}
