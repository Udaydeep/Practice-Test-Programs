package com.bayamp.string.tests;

import org.testng.annotations.DataProvider;

public class dataProvider {

	@DataProvider(name = "dataFromOtherProject")
	public static Object[][] provideData() {
		Object[][] result = null;
		result = new Object[][] { { "udaydeep", "uday", true } };
		return result;
	}

}
