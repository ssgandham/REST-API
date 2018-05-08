package com.example.test.restapi;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class get_user {
	static List<user> list_user = new ArrayList<>();
	Map<Integer, user> map = new HashMap<>();
	static int id = 3;
	static {
		list_user.add(new user(1, "AAA", new Date()));
		list_user.add(new user(2, "BBB", new Date()));
		list_user.add(new user(3, "CCC", new Date()));
	}

	public List<user> get_all_users() {
		return list_user;
	}

	public user get_user_id(int id) {
		for (int i = 0; i < list_user.size(); i++)
			if (list_user.get(i).getId() == id)
				return list_user.get(i);

		return null;
	}

	public user save(user usr) {
		// TODO Auto-generated method stub
		usr.setId(++id);
		list_user.add(usr);
		return usr;
	}

}
