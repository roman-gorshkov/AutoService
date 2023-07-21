package com.autoservice.service;

import com.autoservice.model.Owner;
import com.autoservice.repository.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    private final OwnerRepository ownerRepository;

    @Autowired
    public OwnerService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public void save(Owner owner){
        ownerRepository.save(owner);
    }

    public void delete(Owner owner){
        ownerRepository.delete(owner);
    }

    public Owner update(Owner owner){
        return ownerRepository.update(owner);
    }

    public Owner getByNumberOfPhone(String numberOfPhone){
        return ownerRepository.getByNumberOfPhone(numberOfPhone);
    }
}
