package com.autoservice.service;

import com.autoservice.model.NewSpareParts;
import com.autoservice.repository.NewSparePartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewSparePartsService {
    private final NewSparePartsRepository newSparePartsRepository;

    @Autowired
    public NewSparePartsService(NewSparePartsRepository newSparePartsRepository) {
        this.newSparePartsRepository = newSparePartsRepository;
    }

    public void save(NewSpareParts newSpareParts){
        newSparePartsRepository.save(newSpareParts);
    }

    public void delete(NewSpareParts newSpareParts){
        newSparePartsRepository.save(newSpareParts);
    }

    public NewSpareParts update(NewSpareParts newSpareParts){
        return newSparePartsRepository.update(newSpareParts);
    }

    public NewSpareParts getById(Long id){
        return newSparePartsRepository.getById(id);
    }

    public NewSpareParts getByNameOfProduct(String nameOfProduct){
        return newSparePartsRepository.getByNameOfProduct(nameOfProduct);
    }
}
