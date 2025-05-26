package com.cts.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.entity.User;

@FeignClient(name = "USER-SERVICE" , url = "http://172.31.24.227:9001")
public interface UserClient {
	@GetMapping("/user/userId/{id}")
	User getUserById(@PathVariable int id);
}
