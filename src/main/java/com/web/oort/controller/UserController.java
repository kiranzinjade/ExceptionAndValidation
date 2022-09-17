package com.web.oort.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.oort.UserServiceImpl.UserServiceImpl;
import com.web.oort.model.User;

@RestController
public class UserController {

	@Autowired
	private UserServiceImpl us;

	@PostMapping("/saveuser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		return new ResponseEntity<User>(us.saveUser(user), HttpStatus.CREATED);
	}

	@GetMapping("/fetchall")
	public ResponseEntity<List<User>> getAllUser() {
		return new ResponseEntity<List<User>>(us.fetchAll(), HttpStatus.OK);
	}

	@GetMapping("/fetchbyid/{uid}")
	public ResponseEntity<User> getUser(@PathVariable("uid") Integer uid) {
		return new ResponseEntity<User>(us.fetchOneuser(uid), HttpStatus.OK);
	}

	@DeleteMapping("/deleteuser/{uid}")
	public ResponseEntity<String> deleteUserById(@PathVariable("uid") Integer uid) {

		us.deleteUserById(uid);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
