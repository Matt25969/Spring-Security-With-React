
package com.qa.SpringSecurityWithReact.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringSecurityWithReact.entities.User;
import com.qa.SpringSecurityWithReact.services.MyUserDetailsService;

@RestController
public class UserController {

	@Autowired
	MyUserDetailsService musds;

	@PostMapping("/newUser")
	public User registerNewUser(String username, String password) {
		return musds.registerNewUser(username, password);
	}

	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}

}
