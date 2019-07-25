package programs;

import java.io.*;
import java.util.*;

public class Compare_the_Triplets {
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> l1 = new ArrayList<Integer>();
		int alice = 0, bob = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == b.get(i)) {
			} else if (a.get(i) > b.get(i)) {
				alice++;
			} else {
				bob++;
			}
		}
		l1.add(alice);
		l1.add(bob);
		return l1;
	}

	public static void main(String[] args) throws IOException {
		List<Integer> a = Arrays.asList(5, 6, 7);
		List<Integer> b = Arrays.asList(3, 6, 10);
		List<Integer> result = compareTriplets(a, b);
		System.out.println("Alice points :" + result.get(0) + "\n" + "bob points :" + result.get(1));
	}
}