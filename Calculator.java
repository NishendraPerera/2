import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {

		// getFirstNumber ******************************************************
		System.out.print("Enter the first number: ");
		Scanner sc1 = new Scanner(System.in);
		double firstNumber = sc1.nextDouble();
		// getSecondNumber *****************************************************
		System.out.print("Enter the second number: ");
		Scanner sc2 = new Scanner(System.in);
		double secondNumber = sc1.nextDouble();
		// getOperator + getResult *********************************************
		double result = 0.0;
		boolean hasNoProblem = false;
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Select the operator: ");
		do {
			Scanner sc3 = new Scanner(System.in);
			int operator = sc3.nextInt();
			switch (operator) {
			case 1:
				result = firstNumber + secondNumber;
				hasNoProblem = true;
				break;
			case 2:
				result = firstNumber - secondNumber;
				hasNoProblem = true;
				break;
			case 3:
				result = firstNumber * secondNumber;
				hasNoProblem = true;
				break;
			case 4:
				result = firstNumber / secondNumber;
				hasNoProblem = true;
				break;
			default:
				System.out.println("Please select a valid operator");
				hasNoProblem = false;
				break;
			}
		} while (hasNoProblem == false);
		// printResult *********************************************************
		if (hasNoProblem == true) {
			System.out.println("The result is " + result);
		} else {
			System.out.println("There's been an error");
		}
	}
}