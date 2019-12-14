package com.springboot.ex3.repository;

import org.springframework.data.jpa.repository.JpaRepository;  
import org.springframework.stereotype.Repository;

import com.springboot.ex3.entity.User;  
  
@Repository  
public interface UserRepository extends JpaRepository<User, Long> {
	 @Override
	 User getOne(Long aLong); 
}  