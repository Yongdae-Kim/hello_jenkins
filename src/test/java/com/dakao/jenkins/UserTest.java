package com.dakao.jenkins;


import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void succeed() {
		User u = new User("teach.d", "123");
		assertEquals(u.getName(), "teach.d");
	}
	
	@Test
	public void failed(){
		User u = new User("teach.d", "123");
		assertEquals(u.getName(), "asd");
	}
}
