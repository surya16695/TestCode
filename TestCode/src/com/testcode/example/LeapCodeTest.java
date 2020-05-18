package com.testcode.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapCodeTest {

	@Test
	void test1() {
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(2000);
		assertEquals(val,true);
	}
	@Test
	void test2() {
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(2020);
		assertEquals(val,true);
	}
	
	@Test
	void test3(){
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(1458);
		assertEquals(val,false);
	}
}
