package com.temira.auth_server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = AuthServerApplication.class)
@ActiveProfiles("test")
class AuthServerApplicationTests {

	@Test
	void contextLoads() {
	}

}
