public class LinkedListDriver{
    public static void main(String[]args){
	MyLinkedList a = new MyLinkedList();
	a.add("test0");
	a.add("test1");
	a.add("test2");
	a.add("test3");
	a.add("test4");
	a.add("test5");
	System.out.println("Linked List should have 6 elements:\n " +
			   a + "\n");
	a.remove(3);
	System.out.println("4th element, should be removed:\n " +
			   a + "\n");
	a.add("LocAdd", 4);
	System.out.println("'LocAdd' should be added as 5th element\n " +
			   a + "\n");
	System.out.println("Find result should be -1:\n " +
			   a.find("NOPEE") + "\n");
	System.out.println("Find result should be 4\n " +
			   a.find("LocAdd") + "\n");
	System.out.println("Length: " + a.getLength());
	
    }

}
