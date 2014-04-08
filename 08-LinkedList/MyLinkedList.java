public class MyLinkedList{
    private Node head;
    private int length;

    public MyLinkedList(){
	length = 0;
	head = null;
    }

    public String toString(){
	Node tmp = head.getNext();
	String ans = "";
	ans += head.getData();
	while(tmp != null){
	    ans += ", " + tmp.getData();
	    tmp = tmp.getNext();
	}

	return ans;
    }

    public void add(String s){ //front 
	Node tmp = new Node(s);
	tmp.setNext(head);
	head = tmp;
	length++;
    }

    //6,5,x,4,3,2,1
    public void add(String s, int i){ //add at loc i
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

    public String remove(int i){//remove node, return old
	Node tmp = head;
	for(int x = 0; x < i; x++){
	    tmp = tmp.getNext();
	}
	String old = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext()); //reconnect list without mid term
	length--;
	return old;
    }

    public int find(String s){
	Node tmp = head;
	int index = 0;
        while(tmp != null){
	    if(tmp.getData().equals(s)){
		return index;
	    }else{
		tmp = tmp.getNext();
		index++;
	    }
	}
	return -1; //not found
    }

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
