public class Heap{
    private int[] data;
    private int size;
    private int last;

    public Heap(){
	data = new int[10];
	size = 9;
	last = 0;
    }

    public Heap(int size){
	data = new int[size];
	this.size = size - 1;
	last = 0;
    }

    public void insert(int i){
	if(last + 1 > size){
	    return; 
	}else{
	    last++;
	    data[last] = i;
	    siftUp();
	}
    }


    public void siftUp(){
	int i = last;
	while(i > 1){
	    int parent = i/2;
	    if(data[parent] >= data[i]){
		break; 
	    }
	    int tmp = data[i];
	    data[i] = data[parent];
	    data[parent] = tmp;
	    i = parent;
		
	}
    }

    public void pushDown(){
	int i = last;
	int child = i *2;
	while(child <= last && data[child] > data[i]){
	    if(child + 1 <= last){
		child = min(child, child + 1);
	    }
	    int tmp = data[i];
	    data[i] = data[child];
	    data[child] = tmp;
	    i = child;
	}
    }

    public int remove(){
	if(last == 0){
	    return -9999;
	}else{
	    int min = data[last];
	    data[last] = data[1];
	    last--;
	    pushDown();
	    return min;
	}
    }


    public int[] getHeap(){
	return data;
    }
    
    public int min(int a, int b){
	if(data[a] < data[b]){
	    return a;
	}
	else if(data[b] < data[a]){
	    return b;
	}else{
	    return a;
	}
    }

    public boolean testHeap(){
	for(int i = 1; i < last/2; i++){
	    if((data[i*2] <= data[i]) && (data[(i*2)+1] <= data[i])){
		continue;
	    }else{
		System.out.println("Error. Parent: " + data[i] +
				   " Children: " + data[i*2] + ", " +
				   data[i*2 + 1]);
		return false;
	    }
	}
	return true;
    }

    

    public String toString(){
	String info = "";
	int c = 1;
	info += "Last Index: " + last + "\n";
	while(c < last + 1){
	    info += data[c] + ", ";
	    c++;
	}
	
	return info;
    }
}
	    

