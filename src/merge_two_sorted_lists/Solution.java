package merge_two_sorted_lists;

public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		else if (l2 == null)
			return l1;
		else if (l1.val < l2.val) {
			ListNode r = l1;
			r.next = mergeTwoLists(l1.next, l2);
			return r;
		} else {
			ListNode r = l2;
			r.next = mergeTwoLists(l1, l2.next);
			return r;
		}
	}
}
