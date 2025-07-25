package com.nando.spring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nando.spring1.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    

}
