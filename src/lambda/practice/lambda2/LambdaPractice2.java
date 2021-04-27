package lambda.practice.lambda2;

public class LambdaPractice2 {

	public static void main(String[] args) {
		
		MathOperation sum = (a , b) -> System.out.println(a + b);
		sum.operation(10, 10);
		
		MathOperation sub = (a , b) -> System.out.println(a - b);
		sub.operation(10, 20);
		
		MathOperation mut = (a , b) -> System.out.println(a * b);
		mut.operation(10, 20);
		
		MathOperation div = (a , b) -> System.out.println(a / b);
		div.operation(10, 5);
	}

}
