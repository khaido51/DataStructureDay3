package cm4DataStructureDay3;

public class ChocolateFeast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test case 1
		int n = 6;
		int c = 2;
		int m = 2;

		// Test case 2
//		int n = 10;
//		int c = 2;
//		int m = 5;

		// Test case 3
//		int n = 12;
//		int c = 4;
//		int m = 4;

		int result = totalFeast(n, c, m);
		System.out.println(result);
	}

	public static int totalFeast(int n, int c, int m) {
		int bars = 0;
		int totalFreeBars = 0;
		int remainder = 0;

		while (bars <= 1) {
			// calculate number of bars
			bars = n / c;

			// find total free bars
			totalFreeBars = bars / m;

			// remainder from division.
			remainder = bars % m;

			
			if (totalFreeBars + remainder < m) {
				return bars + totalFreeBars;
			}

			if (totalFreeBars >= m) {
				totalFreeBars += totalFreeBars / m;
				// System.out.println("Total" + totalFreeBars);
			}

			if (remainder != 0) {
				if((totalFreeBars + remainder) % m  == 0) {
					totalFreeBars = totalFreeBars + remainder;
				}
			}

			bars = bars + totalFreeBars;
		}

		return bars;
	}

}
