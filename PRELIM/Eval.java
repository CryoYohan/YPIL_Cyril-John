package PRELIM;
import java.util.Scanner;

public class Eval {
	
	static String equation;
	public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in);
	     equation = sc.nextLine();
	     int result = evaluateExpression(equation);
	     System.out.println("Result: " + result);
	}
	 public static int evaluateExpression(String expression) {
	        int solvedNumber = 0; // Reset solvedNumber for each set of parentheses
	        String operators = "+-/*"	;
	        String operatorToUse = "", operatorFound = "";
	        int counter = 0;
	        int[] numbersToSolve = new int[expression.length()];

	        String foundNumber = "";

	        for (int i = 0; i < expression.length(); i++) {
	            char ch = expression.charAt(i);

	            // Check if open parenthesis found
	            if (ch == '(') {
	                System.out.println("Open parenthesis detected");
	            }

	            // Stores integers
	            if (Character.isDigit(ch)) {
	            		foundNumber += ch;	            		
	 	                System.out.println(counter + " <- counter");
	 	                numbersToSolve[counter] = Integer.parseInt(foundNumber);
	 	                System.out.println(foundNumber + " mweheh ");
//	 	                numbersToSolve[counter] = Integer.parseInt(foundNumber);
	                	foundNumber = "";  
	                	counter++;               	   
	            }

	            // Detect operators
	            for (int j = 0; j < operators.length(); j++) {
	                if (ch == operators.charAt(j)) {                	
	                    operatorFound += ch;
	                    operatorToUse = operatorFound;
//	                    operatorFound = "";
	                    System.out.print("Operator Found -> ");
	                    System.out.println(operatorToUse);
	                }
	            }

	            if (ch == ')' || i == expression.length() - 1) {
	                System.out.println("Closing parenthesis detected or End of the line. Time to solve!");
	                System.out.println("solved number: " + solvedNumber);
	                if (solvedNumber == 0) {
	                    solvedNumber = pMDAS(numbersToSolve[0], operatorToUse, numbersToSolve[1]);
	                } else {
	                    solvedNumber = pMDAS(solvedNumber, operatorToUse, numbersToSolve[counter - 1]);
	                }
	            }
	        }
	        return solvedNumber;
	    }
	
	public static int pMDAS(int num1, String operator, int num2) {
		switch(operator) {
		
		case "+":
			return num1 + num2;			
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;		
		case "/":
			return num1 / num2;			
		default:
			throw new IllegalArgumentException("Invalid operator: " + operator);
		}
	}
}