package com.youconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.youconnect.entities.User;
import com.youconnect.repositories.UserRepositories;
import com.youconnect.security.Authority;

@Service
public class UserService {
	
	@Autowired
	UserRepositories userRepo;
	
	@Autowired
	PasswordEncoder passencoder;
	
	public User save (User user) {
		String encodedPassword = passencoder.encode(user.getPassword());
		user.setPassword(encodedPassword);

		Authority authority = new Authority();
		authority.setAuthority("ROLE_USER");
		authority.setUser(user);
		
		user.getAuthorities().add(authority);
		return userRepo.save(user);
	}

}
