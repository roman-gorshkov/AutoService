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

    @RequestMapping("/save")
    public void save(@RequestBody OrderServices orderServices){
        orderServicesService.save(orderServices);
    }

    @RequestMapping("/delete")
    public void delete(@RequestBody OrderServices orderServices){
        orderServicesService.delete(orderServices);
    }

    @RequestMapping("/update")
    public OrderServices update(@RequestBody OrderServices orderServices){
        return orderServicesService.update(orderServices);
    }

    @GetMapping("/getById")
    public OrderServices getById(@RequestParam Long id){
        return orderServicesService.getById(id);
    }
}
