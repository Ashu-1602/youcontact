package com.youconnect.security;

import java.util.Set;
import org.springframework.security.core.userdetails.UserDetails;
import com.youconnect.entities.User;

public class CustomSecurityUser extends User implements UserDetails {
	
	private static final long serialVersionUID = -7088692319316819306L;
	
	public CustomSecurityUser() {
		
	}
	public CustomSecurityUser(User user) {
		this.setAuthorities(user.getAuthorities());
		this.setId(user.getId());
		this.setName(user.getName());
		this.setPassword(user.getPassword());
		this.setUsername(user.getUsername());
	}

	@Override
	public Set<Authority> getAuthorities() {
		return this.getAuthorities();
	}

	@Override
	public String getPassword() {
		return this.getPassword();
	}

	@Override
	public String getUsername() {
		return this.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}