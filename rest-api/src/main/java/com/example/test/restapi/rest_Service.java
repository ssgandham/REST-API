package com.example.test.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest_Service {

	@Autowired
	private get_user service;

	@GetMapping("/users")
	public List<user> retrieveAllUsers() {
		return service.get_all_users();
	}

	@GetMapping("/users/{id}")
	public user get_id(@PathVariable int id) {
		user usr_tmp = service.get_user_id(id);
		if (usr_tmp == null) {
			throw new notfound_exception("id - " + id);
		}
		return usr_tmp;
	}

	@PostMapping("/save_user")
	public void save_user(@RequestBody user usr) {
		user user1 = service.save(usr);
	}
}
