package org.junitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitOrder {

	@BeforeClass
	public static void launchingChrome() {
		System.out.println("Launching The Google Chrome");

	}

	@AfterClass
	public static void closingChrome() {
		System.out.println("Closing The Google Chrome");

	}

	@Before
	public void startTime() {
		System.out.println("Start");

	}

	@After
	public void endTime() {
		System.out.println("End");

	}

	@Test
	public void tcs1() {
		System.out.println("Test 1");

	}

	@Test
	public void tcs3() {
		System.out.println("Test 3");

	}

	@Test
	private void tcs2() {
		System.out.println("Test 2");

	}

}
