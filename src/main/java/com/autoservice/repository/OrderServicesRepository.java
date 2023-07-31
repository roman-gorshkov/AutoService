package com.autoservice.repository;

import com.autoservice.model.OrderServices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderServicesRepository extends JpaRepository <OrderServices,Long> {
    OrderServices getById(Long id);
}
