package com.autoservice.service;

import com.autoservice.model.Orders;
import com.autoservice.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    public void save(Orders orders){
        ordersRepository.save(orders);
    }

    public void delete(Orders orders){
        ordersRepository.delete(orders);
    }

    public Orders getById(Long id){
        return ordersRepository.getById(id);
    }
}
