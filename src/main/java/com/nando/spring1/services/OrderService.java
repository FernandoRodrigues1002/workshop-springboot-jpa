package com.nando.spring1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nando.spring1.entities.Order;
import com.nando.spring1.repositories.OrderRepository;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();

    }

    public Order findById(Long id){
        Optional<Order> obj =  orderRepository.findById(id);
        return obj.get();
    }
}
