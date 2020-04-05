package epam.junit.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstRemove {
	removeFisrsMain removefirstAat01inString;
	
	@BeforeEach
	void setUp() {
		removefirstAat01inString = new removeFisrsMain();
	}
	@Test
	void test2chars() {
		assertEquals( "B", removefirstAat01inString.removeAFromStringinfirstTwoindex("AB"));
	}
	@Test
	void test5chars() {
		assertEquals("BBCA", removefirstAat01inString.removeAFromStringinfirstTwoindex("BABCA"));
	}
	@Test
	void testnchars() {
		assertEquals("BCDEF", removefirstAat01inString.removeAFromStringinfirstTwoindex("ABCDEF"));
	}
	@Test
	void test1chars() {
		assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex("A"));
	}
	@Test
	void testemptychars() {
		assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex(""));
	}
	@Test
	void test6chars() {
		assertEquals("IBCDE", removefirstAat01inString.removeAFromStringinfirstTwoindex("IBCDE"));
	}
	@Test
	void testsmallchars() {
		assertEquals("acd", removefirstAat01inString.removeAFromStringinfirstTwoindex("acd"));
	}
	@Test
	void testsamechars() {
		assertEquals("AAA", removefirstAat01inString.removeAFromStringinfirstTwoindex("AAAAA"));
	}
	@Test
	void testsame2chars() {
		assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex("AA"));
	}
	@Test
	void testsingleAchars() {
		assertEquals("", removefirstAat01inString.removeAFromStringinfirstTwoindex("A"));
	}
	@Test
	void testBAchars() {
		assertEquals("B", removefirstAat01inString.removeAFromStringinfirstTwoindex("BA"));
	}

	
	

}