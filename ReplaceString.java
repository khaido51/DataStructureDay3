package cm4DataStructureDay4;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String S = "baaabbaabbba";
		//String S = "baabab";
		String S = "baaaba";
		int result = replaceString(S);
		System.out.println("Total moves: " + result);
		
	}

	public static int replaceString(String S) {
		int move = 0;
		for (int i = 1; i < S.length() - 2; i++) {
			char previous = S.charAt(i - 1);
			char current = S.charAt(i);
			char next = S.charAt(i + 1);
			char a = 'a';
			char b = 'b';

			// [b a a a a a]
			// [p c n]
			if (current == previous && current == next) {
					
				if(S.charAt(i) == 'a') {
					S = S.substring(0, i + 1) + b + S.substring(i + 2);
				}
				else {
					S = S.substring(0, i + 1) + a + S.substring(i + 2);
				}
				
				move++;
				i = i + 2;
			
//				System.out.println("value of next " + current + " at position: " + i);
//				System.out.println("value of previous " + previous + " at position: " + (i - 1));
//				System.out.println("value of next " + next + " at position: " + (i + 1));
			}
			
		}
		System.out.println("Updated String: " + S);
		return move;
	}

}
