public class BST{
    private Node root;

    public BST(){
	root = null;
    }

    public boolean delete(int i){
	Node c = root;
	Node p = null;
	while(c != null && c.getData() != i){
	    if(i <= c.getData()){
		p = c;
		c = c.getLeft();
	    }else{
		p = c;
		c = c.getRight();
	    }
	}
	if((c.getLeft() ==  null) || (c.getRight() == null)){
	    Node child;
	    if(c.getLeft()! null){
		child = c.getLeft();
	    }else{
		child = c.getRight();
	    }if(p.getLeft().equals(c)){
		p.setLeft(child);
	    }else{
		p.setRight(child);
	    }
	}
    }

    public void insert(int n){
	if(root == null){
	    root = new Node(n);
	    return;
	}
	Node tmp = root;
	Node top = null;

	while(tmp != null){
	    if(n < tmp.getData()){
		top = tmp;
		tmp = tmp.getLeft();
	    }else{
		top = tmp;
		tmp = tmp.getRight();
	    }
	}
	if(n < top.getData()){
	    top.setLeft(new Node(n));
	}else{
	    top.setRight(new Node(n));
	}
    }

    public Node search(int n){
	Node tmp = root;
	while(tmp != null){
	    if(n < tmp.getData()){
		tmp = tmp.getRight();
	    }
	    else if(n < tmp.getData()){
		tmp = tmp.getLeft();
	    }else{
		return tmp;
	    }
	}
	return null;
    }

    public Node search2(Node n, int i){
	if(n == null || n.getData() == i){
	    return n;
	}if(i < n.getData()){
	    return search2(n.getLeft(), i);
	}else{
	    return search2(n.getRight(), i);
	}
    }

}
		    
