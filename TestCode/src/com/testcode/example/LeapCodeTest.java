package com.testcode.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeapCodeTest {

	@Test
	void test() {
		LeapYear leap = new LeapYear();
		boolean val = leap.isLeap(1000);
		assertEquals(val,true);
	}



}
