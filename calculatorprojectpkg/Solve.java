package calculatorprojectpkg;

import java.util.Stack;
public class Solve {
	  public static String checkTheBlank(String s) {
		    String result = "";
		    for (int i = 0; i < s.length(); i++) {
		      if (s.charAt(i) == '(' || s.charAt(i) == ')' ||s.charAt(i) == '+' || s.charAt(i) == '-' ||s.charAt(i) == '*' || s.charAt(i) == '/')
		      {
		        result += " " + s.charAt(i) + " ";
		      }
		      else
		      {
		        result += s.charAt(i);
		      }
		    }  
		    return result;
	  }
	  public static void checkOperation(Stack<Double> numberStk, Stack<Character> operationsStk) 
	  {
		  char op = operationsStk.pop();
		    double op1 = numberStk.pop();
		    double op2 = numberStk.pop();
		    if (op == '+') 
		    {
		      numberStk.push(op2 + op1);
		    }
		    else if (op == '-')
		    {
		      numberStk.push(op2 - op1);
		    }
		    else if (op == '*')
		    {
		      numberStk.push(op2 * op1);
		    }
		    else if (op == '/')
		    {	
		      numberStk.push(op2 / op1);
		    }
		  }
	  public static double evaluateExpression(String toSolve) 
	  {
	    Stack<Double> numberStk = new Stack<>();
	    Stack<Character> operationsStk = new Stack<>();
	    toSolve = checkTheBlank(toSolve);
	    String[] answer1 = toSolve.split(" ");
	    for(int i = 0; i < answer1.length; i++)
	    {
	    	String characs = answer1[i];
	      if (characs.length() == 0)
	      {
	        continue;
	      }
	      else if (characs.charAt(0) == '+' || characs.charAt(0) == '-') 
	      {
	        while (!operationsStk.isEmpty() && (operationsStk.peek() == '+' || operationsStk.peek() == '-' || operationsStk.peek() == '*' || operationsStk.peek() == '/')) {
	        		checkOperation(numberStk, operationsStk);
	        }
	        operationsStk.push(characs.charAt(0));
	      }
	      else if (characs.charAt(0) == '*' || characs.charAt(0) == '/')
	      {
	        while (!operationsStk.isEmpty() &&(operationsStk.peek() == '*' || operationsStk.peek() == '/')) {
	          checkOperation(numberStk, operationsStk);
	        }
	        operationsStk.push(characs.charAt(0));
	      }
	      else if (characs.trim().charAt(0) == '(') 
	      {
	        operationsStk.push('('); 
	      }
	      else if (characs.trim().charAt(0) == ')') 
	      {
	        while (operationsStk.peek() != '(') {
	          checkOperation(numberStk, operationsStk);
	        }    
	        operationsStk.pop(); 
	      }
	      else { 
	        numberStk.push(Double.valueOf(characs));
	      }
	    }
	    while (!operationsStk.isEmpty()) {
	      checkOperation(numberStk, operationsStk);
	    }
	    return numberStk.pop();
	  }
}
