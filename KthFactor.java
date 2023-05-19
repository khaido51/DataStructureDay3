package cm4DataStructureDay6;


public class KthFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12, k = 6;
		
		int result = kthFactor(n, k);
		System.out.println("Result is: " + result);
	}
	
	public static int kthFactor(int n, int k) {
		//List<Integer> factorList = new ArrayList<Integer>();
		int count = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
					//System.out.println(i);
					count++;
					System.out.println("Count factor: " + count);
					
			}
			if(count == k) {
				return i;
			}
		}
	
		return -1;
	}

}
