package com.web.oort.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.oort.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUid(Integer uid);

}
