public class LinkedListDriver{
    public static void main(String[]args){
	MyLinkedList a = new MyLinkedList();
	a.add("test0");
	a.add("test1");
	a.add("test2");
	a.add("test3");
	a.add("test4");
	a.add("test5");
        a.add("works?", 3);
	System.out.println(a);
	System.out.println(a.find("test3"));
	System.out.println(a.getLength());
	System.out.println(a.length());
	a.remove(2);
	System.out.println(a);
	System.out.println(a.get(2));
	
    }
}
