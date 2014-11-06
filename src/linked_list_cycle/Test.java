package linked_list_cycle;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		assertFalse(solution.hasCycle(n1));
	}

	@org.junit.Test
	public void test2() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		n1.next = n2;
		n2.next = n3;
		n3.next = n1;
		assertTrue(solution.hasCycle(n1));
	}
	
	@org.junit.Test
	public void test3() {
		assertFalse(solution.hasCycle(null));
	}
}
