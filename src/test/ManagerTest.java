package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import code.Human;
import code.Manager;

class ManagerTest {

	@Test
	public static void test_searchHuman_withTrueId_expectHumanWithTrueId() {
		Human human = new Human(1, 50, 10000000L);
		ArrayList<Human> customers = new ArrayList<Human>();
		customers.add(human);
		Manager manager = new Manager(customers);
		final Human result = manager.searchHuman(1);
		assertEquals(human, result);
	}
	
	@Test
	void test_searchHuman_withFalseId_expectNull() {
		Human human = new Human(1, 50, 10000000L);
		ArrayList<Human> customers = new ArrayList<Human>();
		customers.add(human);
		Manager manager = new Manager(customers);
		final Human result = manager.searchHuman(2);
		assertEquals(null, result);
	}
	
	@Test
	void test_approveInsurrance_withTrueId_expectMoney() {
		Human human = new Human(1, 50, 600000000L);
		ArrayList<Human> customers = new ArrayList<Human>();
		customers.add(human);
		Manager manager = new Manager(customers);
		Long actual = manager.approveInsurrance(1);
		Long expected = 1000000L;
		assertEquals(expected, actual);
	}
	
	@Test
	void test_approveInsurrance_withFalseId_expectNegative() {
		Human human = new Human(1, 50, 10000000L);
		ArrayList<Human> customers = new ArrayList<Human>();
		customers.add(human);
		Manager manager = new Manager(customers);
		Long actual = manager.approveInsurrance(0);
		Long expected = -1L;
		assertEquals(expected, actual);
	}
}
