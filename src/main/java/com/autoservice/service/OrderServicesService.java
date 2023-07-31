package com.autoservice.service;

import com.autoservice.model.OrderServices;
import com.autoservice.repository.OrderServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServicesService {
    private final OrderServicesRepository orderServicesRepository;

    @Autowired
    public OrderServicesService(OrderServicesRepository orderServicesRepository) {
        this.orderServicesRepository = orderServicesRepository;
    }

    public void save(OrderServices orderServices){
        orderServicesRepository.save(orderServices);
    }

    public void delete(OrderServices orderServices){
        orderServicesRepository.delete(orderServices);
    }

    public OrderServices getById(Long id){
        return orderServicesRepository.getById(id);
    }
}
