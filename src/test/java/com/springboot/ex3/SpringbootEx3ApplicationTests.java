package com.springboot.ex3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.ex3.entity.User;
import com.springboot.ex3.repository.UserRepository;  

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootEx3ApplicationTests {
	
	@Autowired
	private UserRepository repository;

	@Test
	void contextLoads() {
		User u = repository.getOne(1L);
		Assert.assertEquals("成功的测试用例", "张三", u.getName());
	}

}
