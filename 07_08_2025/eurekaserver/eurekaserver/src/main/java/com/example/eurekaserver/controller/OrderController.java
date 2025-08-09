package com.example.eurekaserver.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public Flux<Order> getOrders() {
        List<Order> orders = List.of(
            new Order(34, "ORD-132", 1121, "C"),
            new Order(35, "ORD-132", 1121, "C"),
            new Order(36, "ORD-132", 1121, "I"),
            new Order(37, "ORD-132", 1121, "I"),
            new Order(38, "ORD-132", 1121, "I"),
            new Order(39, "ORD-140", 1121, "I")
        );
        return Flux.fromIterable(orders);
    }

    record Order(int id, String orderNumber, int orderValue, String orderStatus) {}
}
