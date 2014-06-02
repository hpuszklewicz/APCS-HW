import java.util.*;
import java.io.*;

public class Problem3{
    private int[] chord, curr, song, orig;
    private int notes, chordlen;
    private ArrayList<Integer> ans;
    //io variables
    private File file;
    private Scanner sc;
    private PrintWriter out;

    public Problem3(String path){
	//prepare file and scanner
	ans = new ArrayList<Integer>();
	try{
	    file = new File(path);
	    sc = new Scanner(file);
	}catch(Exception e){
	    e.printStackTrace();
	}

	//prepare the array of notes 
	notes = Integer.parseInt(sc.nextLine());
	song = new int[notes];
	for(int i = 0; i < notes; i++){
	    song[i] = Integer.parseInt(sc.nextLine());
	}

	//prepare ruminant seveneth chord to be tested
	chordlen = Integer.parseInt(sc.nextLine());
	curr = new int[chordlen];
	chord = new int[chordlen];
	orig = new int[chordlen];
	
	for(int j = 0; j < chordlen; j++){
	    int toadd = Integer.parseInt(sc.nextLine());
	    chord[j] = toadd;
	    orig[j] = toadd;
	}

	//test every possible array of length of the rum. 7th. chord
	//they match if their prepareCompare'd versions are equal
	int notecurr = 0;
	while(notecurr < notes - chordlen + 1){
	    chord = Arrays.copyOf(orig, chordlen);

	    for(int i = 0; i < chordlen; i++){
		curr[i] = song[i + notecurr];
	    }

	    int[] a = prepareCompare(curr);
	    int[] b = prepareCompare(chord); 
 
	    if(Arrays.equals(a, b)){
		ans.add(notecurr + 1);
	    }
	    notecurr++;
	    
	}

	//write to file
	try{
	    out = new PrintWriter(new BufferedWriter(new FileWriter("moosick.out")));
	}catch(Exception e){
	    e.printStackTrace();
	}
	out.println(ans.size());
	for(int p = 0; p < ans.size(); p++){
	    out.println(ans.get(p));
	}
	out.close();
    }

    public int[] prepareCompare(int[] chord){
	Arrays.sort(chord);
	int min = findmin(chord);
	for(int i = 0; i < chord.length; i++){
	    chord[i] = chord[i] - min;
	}
	return chord;
    }


    public int findmin(int[] arr){
	int min = Integer.MAX_VALUE;
	for(int i = 0; i < arr.length; i++){
	    if(arr[i] < min){
		min = arr[i];
	    }
	}
	return min;
    }

    public static void main(String[]args){
	Problem3 test = new Problem3("moosick.in");
    }
}
	
	

	
