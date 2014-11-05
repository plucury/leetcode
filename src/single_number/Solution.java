package single_number;

import java.util.HashMap;

public class Solution {

	public int singleNumber(int[] A) {
		if (A.length == 1)
			return A[0];
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int a : A) {
			if (m.get(a) == null)
				m.put(a, 1);
			else
				m.remove(a);
		}
		return m.keySet().iterator().next();
	}

}
