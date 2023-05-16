package cm4DataStructureDay5;

import java.util.ArrayList;
import java.util.List;

public class SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1;
		int end = 50;
		
		List<Integer> num = new ArrayList<Integer>();
		for(int i = start; i <= end; i++) {
			num.add(i);
		}
		System.out.println(num);
		
		List<Integer> sqr = findSquareNum(num);
		for(int i: sqr) {
			System.out.println(i);
		}
	}
	
	public static List<Integer> findSquareNum(List<Integer> num) {
		List<Integer> squareNum = new ArrayList<Integer>();
		for(Integer i: num) {
			double sqr = Math.sqrt(i);
			if(sqr - Math.floor(sqr) == 0)
			{
				squareNum.add(i);
			}
		}
		
		return squareNum;
	}
	
	    

}
