package cm4DataStructureDay3;



public class MinimumGap {

	public static void main(String[] args) {
		int[] arr = { 7, 2, 4, 3, 1, 7 };
		int minGap = findMinGap(arr);
		System.out.println("Minimum gap between two pairs of numbers: " + minGap);
	}

	public static int findMinGap(int[] arr) {
		int minGap = 0;
		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] == arr[j]) {
		            minGap = j - i ;
		           
		            }
		        }
		    }
		
		return minGap;
	}
}
