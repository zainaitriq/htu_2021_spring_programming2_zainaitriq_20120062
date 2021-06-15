package part2;

public class Procedural {
	public static void main(String[] args) {
		int y;
		System.out.println(SumDigit(25));
		System.out.println(SumChar("zaina"));
		y=SumDigit(67);
		System.out.println(y);
	}

	 static int SumDigit(int x) {
		 int z=0;
		String y = Integer.toString(x);
		int[] number = new int[y.length()];
		for (int i = 0; i < y.length(); i++) {
		    number[i] = y.charAt(i) - '0';
		   z=z+number[i];
		}
		return z;
	}
	 static int SumChar(String word) {
		char[] word2= word.toCharArray();
		int y=0;
		for(char c:word2 ) {
			y++;
		}
		return y;
	}
	
}

