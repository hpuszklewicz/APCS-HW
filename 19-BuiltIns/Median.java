import java.util.*;

public class Median{
    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;

    public Median(){
	left = new PriorityQueue<Integer>(11, Collections.reverseOrder());
	right = new PriorityQueue<Integer>();
    }

    public void add(Integer x){
	if(left.size() >= right.size()){
	    right.add(x);
	}else{
	    right.add(x);
	}
    }

    public double findMedian(){
	if(left.size() > right.size()){
	    return left.peek();
	}
	else if(right.size() > left.size()){
	    return right.peek();
	}else{
	    return ((right.peek() + left.peek())/2.0);
	}
    }

    public double removeMedian(){
	if(left.size() > right.size()){
	    return left.poll();
	}
	else if(right.size() > left.size()){
	    return right.poll();
	}
	if(right.poll() == null && left.poll() == null){
	    return -999;
	}
	return ((right.poll() + left.poll())/2.0);
    }

    public String toString(){
	String info = "";
	info += "Median: " + findMedian();
	return info;
    }

}
