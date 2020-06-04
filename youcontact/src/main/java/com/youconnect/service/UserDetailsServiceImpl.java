package com.youconnect.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.youconnect.entities.User;
import com.youconnect.repositories.UserRepositories;
import com.youconnect.security.CustomSecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepositories userrepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user =userrepo.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("Invalid username and password");
		}
		return new CustomSecurityUser(user);
	}

}
