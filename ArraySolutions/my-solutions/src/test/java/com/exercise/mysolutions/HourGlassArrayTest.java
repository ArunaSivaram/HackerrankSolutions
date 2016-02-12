package com.exercise.mysolutions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HourGlassArrayTest extends TestCase {

	private int[][] arraytestcaseone = { { 1, 1, 1, 0, 0, 0 },
			{ 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
			{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 }, };

	public HourGlassArrayTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(HourGlassArrayTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testSumArrayOne() {
		int total = 19;
		int sum = HourGlassArray.displayGreatestSum(arraytestcaseone);
		assertEquals(sum, total);
	}

}
