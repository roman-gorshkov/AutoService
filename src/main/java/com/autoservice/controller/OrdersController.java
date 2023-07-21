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

    @RequestMapping("/save")
    public void save(@RequestBody Orders orders){
        ordersService.save(orders);
    }

    @RequestMapping("/delete")
    public void delete(@RequestBody Orders orders){
        ordersService.delete(orders);
    }

    @RequestMapping("/update")
    public Orders update(@RequestBody Orders orders){
        return ordersService.update(orders);
    }

    @GetMapping("/getById")
    public Orders getById(@RequestParam("id") Long id){
        return ordersService.getById(id);
    }
}
