package reverse_integer;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		int r = solution.reverse(123);
		assertEquals(321, r);
	}

	@org.junit.Test
	public void test2() {
		int r = solution.reverse(-123);
		assertEquals(-321, r);
	}
	
	@org.junit.Test
	public void test3() {
		int r = solution.reverse(-100);
		assertEquals(-1, r);
	}

}
