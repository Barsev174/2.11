package com.example21.controller;

import com.example21.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;
import java.util.Set;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public void addId(@RequestParam(name = "id") Set<Integer> id) {
        basketService.addId(id);
    }

    @GetMapping("/get")
    public Set<Integer> getId() {
        return basketService.get();
    }
}
