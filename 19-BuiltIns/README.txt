TreeMap - a sorted red-black tree, self-balancing binary tree. This structure
	  allows for the children nodes to be colored either red or black. The color
	  of neighboring parents/children determines the balance of a tree - once it
	  is too unbalanced it will restructure itself to follow rules based on the
	  colors.

TreeSet - like a TreeMap, except there can be no duplicate elements in a TreeSet,
	  like in an actual set in math. 

HashMap - associates keys with values and is unordered, so it uses open hashing 
	  probably. There is an initial capacity, however, which automatically 
	  increments based on the load factor (how long until it expands). Each key
	  is associated with an element in the array of the HashMap

HashSet - like a HashMap, except there can be no duplicate elements in a HashMap

Built-In Heap: Java's heap is the PriorityQueue, by defualt it's a minHeap, and you
have to reverse its order to make it a maxHeap (or maybe it's the other way around).

Speed testing: the HashMap proved to be far quicker than the TreeMap, probably because
of it's structure. A hash table structure is more efficient in pulling/adding data but it
isn't sorted like the TreeMap. 