package com.autoservice.controller;

import com.autoservice.model.OrderServices;
import com.autoservice.repository.OrderServicesRepository;
import com.autoservice.service.OrderServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order_services")
public class OrderServicesController {

    private final OrderServicesService orderServicesService;

    @Autowired
    public OrderServicesController(OrderServicesService orderServicesService) {
        this.orderServicesService = orderServicesService;
    }

    @PostMapping
    public void save(@RequestBody OrderServices orderServices){
        orderServicesService.save(orderServices);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id){
        OrderServices orderServices = orderServicesService.getById(id);
        orderServicesService.delete(orderServices);
    }

    @RequestMapping
    public void update(@RequestBody OrderServices orderServices){
        orderServicesService.save(orderServices);
    }

    @GetMapping
    public OrderServices getById(@RequestParam Long id){
        return orderServicesService.getById(id);
    }
}
