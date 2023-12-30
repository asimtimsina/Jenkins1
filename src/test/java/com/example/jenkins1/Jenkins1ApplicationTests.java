package com.example.jenkins1;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Jenkins1ApplicationTests {

	public static Logger log = LoggerFactory.getLogger(Jenkins1Application.class);

	@Test
	void contextLoads() {
		assertEquals(true, true);
	}

}
