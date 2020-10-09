package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.Human;

class TestHuman {

	@Test
	void test_increaseWorkYear_with2Year_expectWorkYearAdded2() {
		Human human = new Human(8);
		assertEquals(10,human.increaseWorkYear(2));
	}

	@Test
	void test_increaseWorkYear_withNegativeYear_expectNegative1() {
		Human human = new Human(10);
		assertEquals(-1, human.increaseWorkYear(-1));
	}
	
	@Test
	void test_increaseWorkYear_withTooBigYear_expectNegative1() {
		Human human = new Human(0);
		assertEquals(-2, human.increaseWorkYear(200));
	}
	
	@Test 
	void test_increase_money() {
     Human human = new Human(8);
	 assertEquals(2000000,human.increaseMoney(1000000));
		
	}
	@Test 
	void test_negative_money() {
		Human human = new Human(8);
		assertEquals(-1, human.increaseMoney(-2));
	}
	
	@Test
	void test_withbig_money() {
		Human human = new Human(8);
		assertEquals(-2, human.increaseMoney(300000000));
	}
}
