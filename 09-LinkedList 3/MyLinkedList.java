public class MyLinkedList{
    private Node head;
    private Node tail;
    private int length; //updated by add/remove


    //Changes made for using tail:
    //
    //add method makes sets the next for the tail instead of head
    //and updates tail to be last element
    //
    //remove method now has to check if the last element was removed
    //if so update the last element to the previous one


    public MyLinkedList(){
	length = 0;
	head = new Node("");
        head.setNext(tail);
	tail = head;
    }

    public String toString(){
	Node tmp = head.getNext();
	String ans = "";
	ans += head.getData(); //add head data
	while(tmp != null){
	    ans += ", " + tmp.getData(); //add next data
	    tmp = tmp.getNext(); //change tmp until null
	}

	return ans;
    }

    public void add(String s){
	tail.setNext(new Node(s));
	tail = tail.getNext();
	length++;
    }


    public void add(String s, int i){
	Node tmp = head;
	for(int x = 0; x < i-1; x++){
	    tmp = tmp.getNext();
	}
	Node newn = new Node(s);
	newn.setNext(tmp.getNext());
	tmp.setNext(newn);
	length++;
    }


    public String get(int i){
	Node tmp = head;
	for(int x = 0; x < i; x++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();
    }


    public String set(int i, String s){ //set data, return old
	Node tmp = head;
	for(int x = 0; x < i; x++){
	    tmp = tmp.getNext();
	}
	String old = tmp.getData();
	tmp.setData(s);
	return old;
    }

    //if i points to last node; change tail to before last one
    public String remove(int i){//remove node, return old
	Node tmp = head;
	for(int x = 0; x < i - 1; x++){
	    tmp = tmp.getNext();
	}
	String old = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext()); //reconnect list without mid term
	length--;
	if(tmp.getNext().getNext() == null){
	    tail = tmp;
	}
	return old;
    }

    public int find(String s){
	Node tmp = head;
	int index = 0;
        while(tmp != null){//iterate through whole list
	    if(tmp.getData().equals(s)){ //check if match
		return index; 
	    }else{
		tmp = tmp.getNext(); //if doesn't go on to next
		index++; 
	    }
	}
	return -1; //not found
    }
    
    //the slow length method, you can just call variable because
    //length is updated along with add/remove
    public int length(){
	Node tmp = head;
	int len = 0;
	while(tmp != null){
	    tmp = tmp.getNext();
	    len++;
	}
	return len;
    }

    public int getLength(){
	return length;
    }
}
