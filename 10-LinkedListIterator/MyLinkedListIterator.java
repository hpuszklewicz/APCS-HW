public class MyLinkedListIterator implements Iterable<E>{
	Node current;
	Node previous;

	public MyLinkedListIterator<E>(Node head){
	    current = head.getNext();
	}

	public Boolean hasNext(){
	    if(current.getNext() != null){
		return true;
	    }else{
		return false;
	    }
	}

	public Node next(){
	    Node ret = current();
	    previous = ret;
	    current = ret.getNext();
	    return previous;
	}

	public void remove(){
	}
    }	
