import java.util.*;

public class QuickSort{

    //helper method to swap elements in place
    public static void swap(int[] ar, int a, int b){
	int x = ar[a];
	ar[a] = ar[b];
	ar[b] = x;
    }

    //split left right
    public static void partition(int[] ar, int pivot, int low, int high){
	int left = low;
	int right = high;
	for(int i = 0; i < ar.length; i++){
	    if(ar[i] < pivot){
		swap(ar, i, pivot);
		left++;
	    }
	    else if(ar[i] > pivot){
		swap(ar, i, pivot);
		right--;
	    }
	}
    }

    public static int[] quickSort(int[] ar){
	if(ar.length == 1){
	    return ar;
	}else{
	    Random r = new Random();
	    int pivot = r.nextInt(ar.length);
	    partition(ar, pivot, 0, ar.length);
	}
    }
	    
}
	
