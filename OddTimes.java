package cm4DataStructureDay5;

import java.util.HashMap;

public class OddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 6, 6, 6, 100, 400, 15, 15, 15, 15, 15, 15, 15, 8, 8, 8 };

		findOddTimesAppearNum(arr);

	}

	public static void findOddTimesAppearNum(int[] arr) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			Integer n = hashmap.get(arr[i]);
			if (hashmap.get(arr[i]) == null) {
				hashmap.put(arr[i], 1);
			} else {
				hashmap.put(arr[i], ++n);
			}
		}

		System.out.println(hashmap + "\n");
		System.out.println("Odd times apperance in the array");
		for (Integer i : hashmap.keySet()) {
			if (hashmap.get(i) % 2 != 0) {
				System.out.println(i + ":" + hashmap.get(i));
			}

		}

	}

}
