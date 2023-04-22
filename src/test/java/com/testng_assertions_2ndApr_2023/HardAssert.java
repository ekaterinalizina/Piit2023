package com.testng_assertions_2ndApr_2023;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void testCase() {
		Assert.assertTrue(2>1);
	}

}
