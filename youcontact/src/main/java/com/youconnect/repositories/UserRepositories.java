package com.youconnect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.youconnect.entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User, Long> {

	User findByUsername(String username);
	
	
}
