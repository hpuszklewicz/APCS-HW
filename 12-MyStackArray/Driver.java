public class Driver{
    
    public static void main(String[]args){
	MyStack s = new MyStack();
	System.out.println(s.isEmpty());
	s.push("test?");
	System.out.println(s);
	System.out.println(s.isEmpty());
	for(int i = 1; i < 10; i++){
	    s.push(Integer.toString(i));
	}
	System.out.println(s);
	System.out.println(s.size());
	for(int i = 11; i < 20; i++){
	    s.push(Integer.toString(i));
	}
	System.out.println(s);
	System.out.println(s.size());
	System.out.println("Testing pop error message.");
	for(int i = 0; i < 21; i++){
	    System.out.println(s.peek() + " " + s.pop());
	}
    }
}
