package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {

		for (int i = 0; i < 12; i++) {
			String s = eggs.get(i);
			// System.out.println("String at element " + i + " " + s);
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
			// System.out.println("String at element " + i + " " + s);
			if (s == true) {
				x += 1;
			}
		}
		return x;
	}

	public static double findTallest(List<Double> peeps) {
		Double x = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > x) {
				x = peeps.get(i);
				// System.out.println(x);
			} else {
			}
		}
		// System.out.println(x);
		return x;
	}

	public static String findLongestWord(List<String> words) {
		String LW = "hi";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > LW.length()) {
				// System.out.println(LW);
				LW = words.get(i);
				// System.out.println(LW);
			} else {
			}
		}
		return LW;
	}

	public static Boolean containsSOS(List<String> message) {
		boolean x = false;
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains("... --- ...")) {
				x = true;
				// System.out.println(x);
			} else {
			}
		}
		// System.out.println(x);
		return x;
	}

	// Add other methods here - Ok #7
	public static List<Double> sortScores(List<Double> result) {
		for (int i = 0; i < result.size(); i++) {
			for (int x = i + 1; x < result.size(); x++) {
				if (result.get(i) > result.get(x)) {
					Double y = result.get(i);
					result.set(i, result.get(x));
					result.set(x, y);
				} else {
				}
			}
			// System.out.println(result);
		}
		return result;
	}

	public static List<String> sortDNA(List<String> unsortedsequences) {

		for (int i = 0; i < unsortedsequences.size(); i++) {
			for (int x = i + 1; x < unsortedsequences.size(); x++) {
				if (unsortedsequences.get(i).length() > unsortedsequences.get(x).length()) {
					String y = unsortedsequences.get(i);
					unsortedsequences.set(i, unsortedsequences.get(x));
					unsortedsequences.set(x, y);
				} else {
				}
			}
		}
		return unsortedsequences;
	}
}
