package com.nando.spring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nando.spring1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
    

}
