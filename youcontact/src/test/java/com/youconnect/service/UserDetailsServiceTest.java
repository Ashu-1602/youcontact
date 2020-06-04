package com.youconnect.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class UserDetailsServiceTest {

	@Test
	void test() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "Pass@123";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println(encodedPassword);
		assertNotEquals(rawPassword, encodedPassword);
		
	}

}
