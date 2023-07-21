package com.autoservice.repository;

import com.autoservice.model.InstallationOfSpareParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstallationOfSparePartsRepository extends JpaRepository<InstallationOfSpareParts,Long> {
    InstallationOfSpareParts getById(Long id);

    InstallationOfSpareParts update(InstallationOfSpareParts installationOfSpareParts);
}
