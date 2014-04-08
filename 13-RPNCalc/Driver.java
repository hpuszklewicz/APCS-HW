public class Driver{

    public static void main(String[]args){
	RPN a = new RPN();
	System.out.println("Working operations: +, -, *, /, ^, log, sqrt, cos, sin, tan");
	System.out.println("\nCommands: \n clear: clears stack \n view:" + 
			   " display stack \n *Not case sensitive \n\n Start inputting values:");
	a.prompt();
    }
}
