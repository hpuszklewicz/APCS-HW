import java.util.*;

public class Driver{
    
    public static void main(String[]args){
	Heap test = new Heap(50);
	System.out.println
	    ("----\nTesting if heap follows rules after insertion:\n");
        for(int i = 0; i < 49; i++){
	    int rand = (int)(Math.random() * 50);
	    test.insert(rand);
	}
	System.out.println(test);
	System.out.println(test.testHeap());
	System.out.println
	    ("----\nTesting if heap follows rules after removal:\n");
	for(int i = 0; i < 25; i++){
	    test.remove();
	}
	System.out.println(test);
	System.out.println(test.testHeap());
    }
}
