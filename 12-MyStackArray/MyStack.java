public class MyStack{
    private int top;
    private String[] stack;
    
    //everything works fine, constructor is a bit ugly need to fix

    public MyStack(){
	stack = new String[10];
	top = -1;
    }

    public class StackException extends RuntimeException{
	public StackException(String message){
	    super(message);
	}
    }

    public void push(String s){
	try{
	    stack[top + 1] = s;
	    top++;
	}catch(ArrayIndexOutOfBoundsException e){
	    String[] doubled = new String[stack.length * 2];
	    for(int i = 0; i < stack.length; i++){
		doubled[i] = stack[i];
	    }
	    stack = doubled;
	    push(s);
	}
    }

    public String pop(){
	if(top - 1 < 0){
	    throw new StackException("Stack already at minimum size.");
	}else{
	    String info = stack[top];
	    stack[top] = null;
	    top--;
	    return info;
	}
    }

    public boolean isEmpty(){
	if(top == 0 && stack[top] == null){
	    return true;
	}else{
	    return false;
	}
    }

    public String peek(){
	return stack[top];
    }

    public int size(){
	return stack.length;
    }

    public String toString(){
	String info = "";
        for(int i = top - 1; i > 0; i--){
	    info += stack[i] + ", ";
	}
	return info;
    }

}
	
