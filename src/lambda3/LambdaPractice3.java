package lambda3;

public class LambdaPractice3 {
	
	public static void main(String[] args) {
		
		LengthOfString len = s -> s.length();
		int length = len.length("Anything");
		System.out.println(length);
	}
}
