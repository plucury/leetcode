package merge_two_sorted_lists;

import static org.junit.Assert.*;

public class Test {

	Solution solution = new Solution();

	@org.junit.Test
	public void test1() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);

		n1.next = n4;
		n2.next = n3;
		
		ListNode r = solution.mergeTwoLists(n1, n2);
		assertEquals(1, r.val);
		r = r.next;
		assertEquals(2, r.val);
		r = r.next;
		assertEquals(3, r.val);
		r = r.next;
		assertEquals(4, r.val);
		r = r.next;
	}

}
