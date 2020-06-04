package com.youconnect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.youconnect.entities.User;

public interface UserRepositories extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
	
}
