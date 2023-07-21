package com.autoservice.service;

import com.autoservice.model.InstallationOfSpareParts;
import com.autoservice.repository.InstallationOfSparePartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstallationOfSparePartsService {
    private final InstallationOfSparePartsRepository installationOfSparePartsRepository;

    @Autowired
    public InstallationOfSparePartsService(InstallationOfSparePartsRepository installationOfSparePartsRepository) {
        this.installationOfSparePartsRepository = installationOfSparePartsRepository;
    }
    public void save(InstallationOfSpareParts installationOfSpareParts){
        installationOfSparePartsRepository.save(installationOfSpareParts);
    }

    public void delete(InstallationOfSpareParts installationOfSpareParts){
        installationOfSparePartsRepository.delete(installationOfSpareParts);
    }

    public InstallationOfSpareParts update(InstallationOfSpareParts installationOfSpareParts){
        return installationOfSparePartsRepository.update(installationOfSpareParts);
    }

    public InstallationOfSpareParts getById(Long id){
        return installationOfSparePartsRepository.getById(id);
    }
}
