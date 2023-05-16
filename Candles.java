package cm4DataStructureDay5;

import java.util.ArrayList;
import java.util.List;

public class Candles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> candles = new ArrayList<Integer>();
		candles.add(4);
		candles.add(4);
		candles.add(1);
		candles.add(3);
		candles.add(5);

		for(Integer i: candles) {
			System.out.println(i);
		}
		
		int result = findHighestCandle(candles);
		System.out.println("Number of highest candles are: " + result);
	}
	
	public static int findHighestCandle(List<Integer> candles) {
		int count = 0;
		int highest = candles.get(0);
		
		for(int i = 0; i < candles.size();i++) {
			if(candles.get(i) > highest) {
				highest = candles.get(i) ;
			
			}
			//System.out.println("Highest candles is " + highest);
			//System.out.println("Number of highest candles is: " + count);
			//return highest;
		}
	
		for(Integer i: candles) {
			if(i == highest) {
				count++;
			}
		}
		//System.out.println("count: " + count);
		return count;
		
	}

}
