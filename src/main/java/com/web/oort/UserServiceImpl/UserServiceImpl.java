package com.web.oort.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.oort.model.User;
import com.web.oort.userrepository.UserRepository;

@Service
public class UserServiceImpl {

	@Autowired
	private UserRepository ur;

	public User saveUser(User user) {

		return ur.save(user);
	}

	public List<User> fetchAll() {

		return ur.findAll();
	}

	public User fetchOneuser(Integer uid) {

		return ur.findByUid(uid);
	}

	public void deleteUserById(Integer uid) {

		ur.deleteById(uid);
	}

}
