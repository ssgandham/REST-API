package com.example.test.restapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class notfound_exception extends RuntimeException {

	public notfound_exception(String string) {
		// TODO Auto-generated constructor stub
		super(string);
	}

}
