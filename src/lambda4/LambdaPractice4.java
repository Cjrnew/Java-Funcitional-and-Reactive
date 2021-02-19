package lambda4;

import lambda3.LengthOfString;

public class LambdaPractice4 {
	
	public static void main(String[] args) {
		
		LengthOfString len = s -> {
			
			int l = s.length();
			System.out.println("The length of the given String is " + l);
			return l;
		};
		int length = len.length("Anything else");
		System.out.println(length);
	}
}
