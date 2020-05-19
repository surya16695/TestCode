package com.testcode.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapCodeTest {
	
	@Test
	void test1() {
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(2000);
		assertTrue(val);
	}
	@Test
	void test2() {
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(2020);
		assertTrue(val);
	}
	
	@Test
	void test3(){
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(2001);
		assertFalse(val);
	}
	
	@Test
	void test4(){
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(1996);
		assertTrue(val);
	}
	@Test
	void test5(){
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(1995);
		assertFalse(val);
	}
}
