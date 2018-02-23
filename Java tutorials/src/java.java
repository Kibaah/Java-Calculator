import java.util.Scanner;

public class java {
	
	
	public static void main(String []args) {	
		calculator();
	
	}
	private static void calculator() {
		System.out.print("Welcom to your calculator.");
		System.out.print("Please, input your first numbre to get started.");
		
		Scanner scanner = new Scanner(System.in);
		
		double num1, num2, answer = 0;
		
		num1 = scanner.nextDouble();
		
		System.out.println("Please, introduce a math operator. ( *, -, +, / )");
		
		String operators = scanner.next();
		
		if (operators.equals("+") || operators.equals("-") || operators.equals("*") || operators.equals("/")) {
			
			System.out.println("You have choosen to " + operators + " your numbers.");
			System.out.println("Please enter your second number.");
			
			num2 = scanner.nextDouble();
			
			if (operators.equals("+")) {
					answer = num1 + num2;
			} else if (operators.equals("-")) {
					answer = num1 - num2;
			} else if (operators.equals("*")) {
					answer = num1 + num2;
			} else if (operators.equals("/")) {
				answer = num1 / num2;
			} 
			
			System.out.print("Your answer is " + answer);
			
			// Separete stuff
			
			} else {
			System.out.println("ERROR, please enter a valid operator! ");
			System.out.println("Starting program again.");
			calculator();
		}
	}
}



