package populating_next_right_pointers_in_each_node;

public class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}

	public String toString() {
		return this.val + "";
	}
}
