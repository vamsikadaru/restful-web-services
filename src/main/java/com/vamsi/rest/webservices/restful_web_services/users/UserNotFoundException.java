package com.vamsi.rest.webservices.restful_web_services.users;

import java.lang.RuntimeException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends Exception {

	public UserNotFoundException(String message) {
		super(message);
	}
}
