package cm4DataStructureDay6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SockMerchants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> sock = new ArrayList<Integer>();
		sock.add(1);
		sock.add(2);
		sock.add(1);
		sock.add(2);
		sock.add(1);
		sock.add(2);
		sock.add(3);

		int result = sockMerchant(sock);
		
		System.out.println("Number of pair is: " + result);
		
	}
	
	public static int sockMerchant(List<Integer> arr) {
		int count = 0;
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for(int i = 0; i < arr.size(); i++) {
			
			if(hashmap.containsKey(arr.get(i))){
				hashmap.put(arr.get(i), hashmap.get(arr.get(i)) + 1);
				if(hashmap.get(arr.get(i)) % 2 == 0) {
					count++;
					
				}
			}
			else {
				hashmap.put(arr.get(i), 1);
			}
			System.out.println(hashmap + "\n");
		}
		return count;
	}

}
