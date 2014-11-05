package single_number;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		int a[] = { 1 };
		assertEquals(1, solution.singleNumber(a));
	}

	@org.junit.Test
	public void test2() {
		int a[] = { 2, 2, 3, 1, 3 };
		assertEquals(1, solution.singleNumber(a));
	}

	@org.junit.Test
	public void test3() {
		int a[] = { 2, 2, -1, -1, 1 };
		assertEquals(1, solution.singleNumber(a));
	}

	@org.junit.Test
	public void test4() {
		int a[] = { 1, 3, 1, -1, 3 };
		assertEquals(-1, solution.singleNumber(a));
	}
}
