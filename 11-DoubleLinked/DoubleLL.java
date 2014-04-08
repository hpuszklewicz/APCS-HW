//Hubert Puszklewicz & Johnathan Yan

import java.util.*;
import java.io.*;

public class DoubleLL<E>{

    private class Node<E>{
	E data;
	Node<E> next, prev;
	
	public Node(E d){
	    this.data = d;
	}

	public String toString(){
	    return "" + data;
	}

	public void setData(E d){
	    data = d;
	}

	public E getData(){
	    return data;
	}

	public void setNext(Node<E> n){
	    next = n;
	}

	public Node<E> getNext(){
	    return next;
	}

	public void setPrev(Node<E> p){
	    prev = p;
	}
	
	public Node<E> getPrev(){
	    return prev;
	}
    }

    private Node<E> current;
    private Node<E> head;
    
    //current: world
    //go to else statement
    //set next of new Node to world
    //set previous of new Node to the Node
    //set current to
    
    public void insert(E d) {
	Node<E> n = new Node<E>(d);
	if (current == null){
	    current = n;
	    head = n;
	    current.setPrev(n);
	    current.setNext(n);// to make circular
	}
	else{
	    n.setNext(current.getNext());
	    n.setPrev(current);
	    current.setNext(n);
	    current = n;
	}
    }
    


    public E getCurrent(){
	return current.getData();
    }
    
    public void forward() {
	if (current.getNext() != null)
	    current = current.getNext();
    }

    public void back() {
	if (current.getPrev() != null)
	    current = current.getPrev();
    }

    public String toString(){
	int count = 0;
	if (current == null)
	    return "";
	Node<E> tmp = head;
	String s = "";
	while (tmp != null && count < 3) {
	    s = s + tmp.getData() + " ";
	    tmp = tmp.getNext();
	    if (tmp == head)
		count++;
	}
	return s;
    }
    

    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	System.out.println("TESTS");
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
    }
}
	    
