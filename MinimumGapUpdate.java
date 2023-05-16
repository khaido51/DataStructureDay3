package cm4DataStructureDay5;

import java.util.ArrayList;
import java.util.List;

public class MinimumGapUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(7);
		arr.add(1);
		arr.add(3);
		arr.add(4);
		arr.add(2);
		arr.add(1);
		arr.add(7);
		System.out.println(arr.toString());
		int gap = findMinimumGap(arr);
		System.out.println("Minimum gap is: " + gap);
	}

	public static int findMinimumGap(List<Integer> arr) {
		int minGap = 0;
		List<Integer> newList = new ArrayList<>();

		for (int i = 0; i < arr.size(); i++) {
			int num = arr.get(i);
			if (newList.contains(num)) {
				int lastIndex = newList.indexOf(num);
				System.out.println("Last index: " + lastIndex + " value is: " + newList.get(lastIndex));
				int repeatedValue = newList.size();
				System.out.println("repeatedValue index: " + repeatedValue);
				int gap = repeatedValue - lastIndex;
				System.out.println("Gap is " + gap);
				minGap = gap;
				break;
			}
			newList.add(num);
			System.out.println("New List");
			System.out.println(newList.toString());
		}
		return minGap;
	}

}
