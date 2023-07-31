package com.autoservice.repository;

import com.autoservice.model.Automobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomobileRepository extends JpaRepository<Automobile,Long> {
    Automobile getById(Long id);
    Automobile getByLicensePlate(String licensePlate);
    Automobile getByVINNumber(String VINNumber);
}
