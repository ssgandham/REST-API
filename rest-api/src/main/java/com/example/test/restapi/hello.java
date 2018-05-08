package com.example.test.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping(path = "/hello_bean/{name}")
	public hello_bean hello_bean(@PathVariable String name) {
		return new hello_bean(String.format("hello, %s", name));
	}

}
