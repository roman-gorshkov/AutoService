package com.autoservice.service;

import com.autoservice.model.Automobile;
import com.autoservice.repository.AutomobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomobileService {
    private final AutomobileRepository automobileRepository;

    @Autowired
    public AutomobileService(AutomobileRepository automobileRepository) {
        this.automobileRepository = automobileRepository;
    }

    public void save(Automobile automobile){
       automobileRepository.save(automobile);
    }

    public void delete(Automobile automobile){
        automobileRepository.delete(automobile);
    }

    public Automobile getById(Long id){
        return automobileRepository.getById(id);
    }

    public Automobile getByLicensePlate(String licensePlate){
        return automobileRepository.getByLicensePlate(licensePlate);
    }

    public Automobile getByVINNumber(String VINNumber){
        return automobileRepository.getByVINNumber((VINNumber));
    }
}
