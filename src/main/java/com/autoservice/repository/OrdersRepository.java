package com.autoservice.repository;

import com.autoservice.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository <Orders,Long> {
    Orders getById(Long id);

    Orders update(Orders orders);

}
