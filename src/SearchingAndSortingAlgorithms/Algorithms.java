package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {

		for (int i = 0; i < 12; i++) {
			String s = eggs.get(i);
			System.out.println("String at element " + i + " " + s);
			if (s.equals("cracked")) {
				return i;
			}

		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int x = 0;
		for (int i = 0; i < 24; i++) {
			Boolean s = oysters.get(i);
			System.out.println("String at element " + i + " " + s);

			if (s == true) {
				x += 1;
			}
		
		}
		return x;
	}
	// Add other methods here
}