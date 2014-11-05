package reverse_integer;

public class Solution {
	public int reverse(int x) {
		String pre = x < 0 ? "-" : "";
		String n = x < 0 ? new Integer(x).toString().substring(1)
				: new Integer(x).toString();
		StringBuilder sb = new StringBuilder();
		sb.append(pre);
		for (int i = n.length(); i > 0; i--) {
			sb.append(n.charAt(i - 1));
		}
		return Integer.valueOf(sb.toString());
	}
}