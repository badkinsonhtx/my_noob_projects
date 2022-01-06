import java.util.Scanner;

public class Calculator {

	String go;
	
	public static void main(String[] args) {
		
		boolean goAgain = true;
		
		do{
			Scanner input = new Scanner(System.in);
			Scanner again = new Scanner(System.in);
	        System.out.println("Enter first number: \n");
	        double num1 = input.nextDouble();
	        System.out.println("\nEnter an operator such as '+', '-', '*', '/': \n");
	        char operator = input.next().charAt(0);
	        System.out.println("\nEnter the second number: \n");
	        double num2 = input.nextDouble();
	        Op Operator = new Op(num1, num2);
	        
	        
	        switch(operator) {
	        case '+':
	        	System.out.println("\n" + num1 + " " + operator + " " + num2 + " = " + Operator.addNumbers(num1, num2));
	        	System.out.println("\nUse calculator again? ");
	        	String go = again.next();
		        go = again.next();
		        if(go.equalsIgnoreCase("N") || go.equalsIgnoreCase("No")) {
		        	again.close(); 
		        	input.close();
		        	goAgain = false;
		        	System.exit(0);
		        }else {
		        	break;
		        }
	        case '-':
	        	System.out.println("\n" + num1 + " " + operator + " " + num2 + " = " + Operator.subNumbers(num1, num2));
	        	System.out.println("\nUse calculator again? ");
		        go = again.next();
		        if(go.equalsIgnoreCase("N") || go.equalsIgnoreCase("No")) {
		        	again.close(); 
		        	input.close();
		        	goAgain = false;
		        	System.exit(0);
		        }else {
		        	break;
		        }
	        case '*':
	        	System.out.println("\n" + num1 + " " + operator + " " + num2 + " = " + Operator.multNumbers(num1, num2));
	        	System.out.println("\nUse calculator again? ");
		        go = again.next();
		        if(go.equalsIgnoreCase("N") || go.equalsIgnoreCase("No")) {
		        	again.close(); 
		        	input.close();
		        	goAgain = false;
		        	System.exit(0);
		        }else {
		        	break;
		        }
	        case '/':
	        	System.out.println("\n" + num1 + " " + operator + " " + num2 + " = " + Operator.divNumbers(num1, num2));
	        	System.out.println("\nUse calculator again? ");
		        go = again.next();
		        if(go.equalsIgnoreCase("N") || go.equalsIgnoreCase("No")) {
		        	again.close(); 
		        	input.close();
		        	goAgain = false;
		        	System.exit(0);
		        }else {
		        	break;
		        }
		    
	        }
		}
		while(goAgain);
    }
}	
