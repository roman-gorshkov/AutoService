package com.autoservice.controller;

import com.autoservice.model.Orders;
import com.autoservice.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @PostMapping
    public void save(@RequestBody Orders orders){
        ordersService.save(orders);
    }

    @DeleteMapping
    public void delete(@RequestParam("id") Long id){
        Orders orders = ordersService.getById(id);
        ordersService.delete(orders);
    }

    @PutMapping
    public void update(@RequestBody Orders orders){
        ordersService.save(orders);
    }

    @GetMapping
    public Orders getById(@RequestParam("id") Long id){
        return ordersService.getById(id);
    }
}
