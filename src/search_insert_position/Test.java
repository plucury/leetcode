package search_insert_position;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		int[] a = { 1, 3, 5, 6 };
		assertEquals(2, solution.searchInsert(a, 5));
	}

	@org.junit.Test
	public void test2() {
		int[] a = { 1, 3, 5, 6 };
		assertEquals(1, solution.searchInsert(a, 2));
	}

	@org.junit.Test
	public void test3() {
		int[] a = { 1, 3, 5, 6 };
		assertEquals(4, solution.searchInsert(a, 7));
	}

	@org.junit.Test
	public void test4() {
		int[] a = { 1, 3, 5, 6 };
		assertEquals(0, solution.searchInsert(a, 0));
	}

	@org.junit.Test
	public void test5() {
		int[] a = {};
		assertEquals(0, solution.searchInsert(a, 5));
	}
}
