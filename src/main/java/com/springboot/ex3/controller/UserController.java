package com.springboot.ex3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;  
  
import com.springboot.ex3.entity.User;  
import com.springboot.ex3.repository.UserRepository;  
  
@RestController
@SpringBootApplication(scanBasePackages = "com.springboot.ex3.controller")
@ComponentScan(basePackages = {"com.*"})
public class UserController {  
  
  @Autowired  
  private UserRepository userRepository;  
  
  @GetMapping("/user/{id}")
  public User findById(@PathVariable Long id) {  
    return this.userRepository.getOne(id);  
  }  
}  