package com.bayamp.palindrometests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Palindrome {

	@Test
	public static void positiveTestPalindrome1() {

		String checkWord = "malayalam";

		boolean expectedResult = true;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void positiveTestPalindrome2() {

		String checkWord = "Golu";

		boolean expectedResult = false;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void positiveTestPalindrome3() {

		String checkWord = "MAlayaLam";// mixed cased letters

		boolean expectedResult = true;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void positiveTestPalindrome5() {
		// if we ignore space its a palindrome
		String checkWord = "race car";

		boolean expectedResult = true;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void negativeTestPalindrome1() {

		String checkWord = "MA layaLam";// space in between

		boolean expectedResult = true;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void negativeTestPalindrome2() {

		String checkWord = " MAlayaLam";// space in front of word

		boolean expectedResult = true;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void negativeTestPalindrome3() {

		String checkWord = "so1mam1os";// alphanumeric

		boolean expectedResult = true;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void negativeTestPalindrome4() {

		String checkWord = "%A$n.n$A%";// special characters and letters

		boolean expectedResult = true;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	@Test
	public static void negativeTestPalindrome6() {
		// if we ignore space its a palindrome
		String checkWord = null;

		boolean expectedResult = false;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	public static void negativeTestPalindrome7() {
		// if we ignore space its a palindrome
		String checkWord = " ";

		boolean expectedResult = false;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}

	public static void negativeTestPalindrome8() {
		// if we ignore space its a palindrome
		String checkWord = " ";

		boolean expectedResult = false;

		boolean actualResult = Palindrome.checkPalindrome(checkWord);

		Assert.assertEquals(actualResult, expectedResult);

	}
	
	// Method returns true if input string passed is palindrome else return false

	public static boolean checkPalindrome(String inputString) {

		if (inputString == null)
			return false;
		else {
			inputString = inputString.replaceAll("[^a-zA-Z]+", "")
					.toLowerCase();
			int length = inputString.length();
			for (int i = 0; i < length / 2; i++) {
				if (inputString.charAt(i) != inputString.charAt(length - i - 1))
					return false;
			}
			return true;
		}
	}

}
