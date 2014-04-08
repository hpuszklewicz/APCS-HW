import java.util.*;
import java.lang.Math;

public class RPN{
    private MyStack stack;
    private Scanner scan;
    private String[] operations;
    private String[] operations2;
    private String input = "";
    
    public RPN(){
	stack = new MyStack();
	scan = new Scanner(System.in);
	operations = new String[]{"+", "-", "*", "/", "^", "log"};
	operations2 = new String[]{"sqrt", "cos", "sin", "tan"};
    }

    public void prompt(){
	try{
	    input = scan.nextLine();
	    Double dinput = Double.parseDouble(input);
	    String dsinput = String.valueOf(dinput);
	    while(dinput instanceof Double){
	        stack.push(dsinput);
		prompt();
	    }
	}catch(Exception InputMismatchException){
	    if(checkOp(input)){
		twoinputs();
	    }else if(checkOp2(input)){
		oneinput();
	    }else{
	        if(input.equalsIgnoreCase("view")){
		    System.out.println("Stack: " + stack); prompt();
		}else if(input.equalsIgnoreCase("clear")){
		    stack = new MyStack(); prompt();
		}else{
		    System.out.println("Invalid Operation"); prompt();
		}
	    }
	}
    }

    public void twoinputs(){
	if(stack.getSize() < 2){
	    System.out.println("Error: not enough elements to complete.");
	    prompt();
	}
	Double ans = 0.0;
	Double first = Double.parseDouble(stack.pop());
	Double second = Double.parseDouble(stack.pop());
      	switch(input){
	case "+": ans = first + second; break;
	case "-": ans = first - second; break; 
	case "*": ans = first * second; break;
	case "/": ans = second / first; break;
	case "^": ans = Math.pow(first, second); break;
	case "log": ans = Math.log(first)/Math.log(second); break;
	default: ans = 0.0;
	}
	stack.push(String.valueOf(ans));
	System.out.println("Result: " + ans + ", " +  stack.nextTwo());
	prompt();
    }

    public void oneinput(){
	if(stack.getSize() == 0){
	    System.out.println("Error: not enough elements to complete.");
	    prompt();
	}
        Double ans = 0.0;
	Double first = Double.parseDouble(stack.pop());
	switch(input){
	case "sqrt": ans = Math.sqrt(first); break;
	case "cos": ans = Math.cos(Math.toRadians(first)); break;
	case "sin": ans = Math.sin(Math.toRadians(first)); break;
	case "tan": ans = Math.tan(Math.toRadians(first)); break;
	default: ans = 0.0;
	}
	stack.push(String.valueOf(ans));
	System.out.println("Result: " + ans + ", " + stack.nextTwo());
	prompt();
    }

    public boolean checkOp(String s){
        return Arrays.asList(operations).contains(s);
    }

    public boolean checkOp2(String s){
	return Arrays.asList(operations2).contains(s);
    }

}
	

