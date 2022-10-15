package com.example21.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Objects;
import java.util.Set;

@Service
@SessionScope
public class BasketServiceImpl implements BasketService {
    private final Set<Integer> productId;

    public BasketServiceImpl(Set<Integer> id) {
        this.productId = id;
    }

    @Override
    public void addId(Set<Integer> id) {
        for (Integer itemId : id) {
            productId.add(itemId);
        }
    }

    @Override
    public Set<Integer> get() {
        return productId;
    }
}
