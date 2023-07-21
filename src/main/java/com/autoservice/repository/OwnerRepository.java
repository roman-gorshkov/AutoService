package com.autoservice.repository;

import com.autoservice.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
    Owner getByNumberOfPhone(String numberOfPhone);

    Owner update(Owner owner);
}
