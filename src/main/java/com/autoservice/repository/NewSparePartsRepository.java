package com.autoservice.repository;

import com.autoservice.model.NewSpareParts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewSparePartsRepository extends JpaRepository<NewSpareParts,Long> {
    NewSpareParts getById(Long id);
    NewSpareParts getByNameOfProduct(String nameOfProduct);

    NewSpareParts update(NewSpareParts newSpareParts);
}
