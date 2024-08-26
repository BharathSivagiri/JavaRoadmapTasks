package Week_3;

import java.util.*;

public class collectioninterfaceWeek3
{
    public static void main(String[] args) {
        //All the methods in collection interface
        //add(), remove(), contains(), isEmpty(), size(), etc.

        //List interface
        //ArrayList
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Displaying the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Checking if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + arrayList.isEmpty());

        // Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // Checking if the ArrayList contains a specific element
        System.out.println("Does ArrayList contain 'Apple'? " + arrayList.contains("Apple"));

        // Getting the index of a specific element
        System.out.println("Index of 'Banana' in ArrayList: " + arrayList.indexOf("Banana"));

        // Removing an element from the ArrayList
        arrayList.remove("Cherry");
        System.out.println("ArrayList after removing 'Cherry': " + arrayList);

        // Removing an element at a specific index
        arrayList.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + arrayList);

        // Clearing the ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);

        //-----------------------------------------------------------
        //LinkedList
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Checking if the LinkedList is empty
        System.out.println("Is LinkedList empty? " + linkedList.isEmpty());

        // Getting the size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());

        // Checking if the LinkedList contains a specific element
        System.out.println("Does LinkedList contain 'Apple'? " + linkedList.contains("Apple"));

        // Getting the index of a specific element
        System.out.println("Index of 'Banana' in LinkedList: " + linkedList.indexOf("Banana"));

        // Removing an element from the LinkedList
        linkedList.remove("Cherry");
        System.out.println("LinkedList after removing 'Cherry': " + linkedList);

        // Removing an element at a specific index
        linkedList.remove(0);
        System.out.println("LinkedList after removing element at index 0: " + linkedList);

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);

        // Adding elements at the beginning and end of the LinkedList
        linkedList.addFirst("Apple");
        linkedList.addLast("Cherry");
        System.out.println("LinkedList after adding 'Apple' at the beginning and 'Cherry' at the end: " + linkedList);

        // Removing the first and last elements of the LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing the first and last elements: " + linkedList);

        //-----------------------------------------------------------
        //Vector
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Displaying the Vector
        System.out.println("Vector: " + vector);

        // Checking if the Vector is empty
        System.out.println("Is Vector empty? " + vector.isEmpty());

        // Getting the size of the Vector
        System.out.println("Size of Vector: " + vector.size());

        // Checking if the Vector contains a specific element
        System.out.println("Does Vector contain 'Apple'? " + vector.contains("Apple"));

        // Getting the index of a specific element
        System.out.println("Index of 'Banana' in Vector: " + vector.indexOf("Banana"));

        // Removing an element from the Vector
        vector.remove("Cherry");
        System.out.println("Vector after removing 'Cherry': " + vector);

        // Removing an element at a specific index
        vector.remove(0);
        System.out.println("Vector after removing element at index 0: " + vector);

        // Clearing the Vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);

        // Vector also supports dynamic resizing
        // Adding elements to the Vector
        for (int i = 0; i < 10; i++) {
            vector.add("Element " + i);
        }
        System.out.println("Vector after adding 10 elements: " + vector);

        // Getting the capacity of the Vector
        System.out.println("Capacity of Vector: " + vector.capacity());

        // Increasing the capacity of the Vector
        vector.ensureCapacity(20);
        System.out.println("Capacity of Vector after ensuring capacity: " + vector.capacity());

        // Trimming the capacity of the Vector
        vector.trimToSize();
        System.out.println("Capacity of Vector after trimming: " + vector.capacity());

        //-----------------------------------------------------------
        //Stack
        // Creating a Stack
        Stack<String> stack = new Stack<>();

        // Adding elements to the Stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Displaying the Stack
        System.out.println("Stack: " + stack);

        // Checking if the Stack is empty
        System.out.println("Is Stack empty? " + stack.isEmpty());

        // Getting the size of the Stack
        System.out.println("Size of Stack: " + stack.size());

        // Peeking at the top element of the Stack
        System.out.println("Top element of Stack: " + stack.peek());

        // Removing an element from the Stack
        System.out.println("Popped element from Stack: " + stack.pop());
        System.out.println("Stack after popping: " + stack);

        // Clearing the Stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);

        //-----------------------------------------------------------
        //Oueue Interface
        //PriorityQueue
        // Creating a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements to the PriorityQueue
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Checking if the PriorityQueue is empty
        System.out.println("Is PriorityQueue empty? " + priorityQueue.isEmpty());

        // Getting the size of the PriorityQueue
        System.out.println("Size of PriorityQueue: " + priorityQueue.size());

        // Removing an element from the PriorityQueue (in this case, the highest priority element)
        System.out.println("Removed element from PriorityQueue: " + priorityQueue.poll());
        System.out.println("PriorityQueue after removing: " + priorityQueue);

        // Clearing the PriorityQueue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clearing: " + priorityQueue);

        // PriorityQueue also supports custom comparator
        PriorityQueue<String> customPriorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // Reverse order
            }
        });

        // Adding elements to the custom PriorityQueue
        customPriorityQueue.add("Apple");
        customPriorityQueue.add("Banana");
        customPriorityQueue.add("Cherry");

        // Displaying the custom PriorityQueue
        System.out.println("Custom PriorityQueue: " + customPriorityQueue);

        // Removing an element from the custom PriorityQueue (in this case, the highest priority element)
        System.out.println("Removed element from Custom PriorityQueue: " + customPriorityQueue.poll());
        System.out.println("Custom PriorityQueue after removing: " + customPriorityQueue);

        // Clearing the custom PriorityQueue
        customPriorityQueue.clear();
        System.out.println("Custom PriorityQueue after clearing: " + customPriorityQueue);

        //Deque
        //ArrayDeque
        // Creating an ArrayDeque
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // Adding elements to the ArrayDeque
        arrayDeque.add("Apple");
        arrayDeque.add("Banana");
        arrayDeque.add("Cherry");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + arrayDeque);

        // Checking if the ArrayDeque is empty
        System.out.println("Is ArrayDeque empty? " + arrayDeque.isEmpty());

        // Getting the size of the ArrayDeque
        System.out.println("Size of ArrayDeque: " + arrayDeque.size());

        // Removing an element from the ArrayDeque (from the end)
        System.out.println("Removed element from ArrayDeque: " + arrayDeque.pollLast());
        System.out.println("ArrayDeque after removing from the end: " + arrayDeque);

        // Removing an element from the ArrayDeque (from the beginning)
        System.out.println("Removed element from ArrayDeque: " + arrayDeque.pollFirst());
        System.out.println("ArrayDeque after removing from the beginning: " + arrayDeque);

        // Clearing the ArrayDeque
        arrayDeque.clear();
        System.out.println("ArrayDeque after clearing: " + arrayDeque);

        // ArrayDeque also supports adding elements at the beginning and end
        arrayDeque.addFirst("Apple");
        arrayDeque.addLast("Cherry");
        System.out.println("ArrayDeque after adding 'Apple' at the beginning and 'Cherry' at the end: " + arrayDeque);

        // Removing an element from the ArrayDeque (from the beginning)
        System.out.println("Removed element from ArrayDeque: " + arrayDeque.pollFirst());
        System.out.println("ArrayDeque after removing from the beginning: " + arrayDeque);

        // Removing an element from the ArrayDeque (from the end)
        System.out.println("Removed element from ArrayDeque: " + arrayDeque.pollLast());
        System.out.println("ArrayDeque after removing from the end: " + arrayDeque);


        //----------------------------------------------------------
        //Set Interface
        //HashSet
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Displaying the HashSet
        System.out.println("HashSet: " + hashSet);

        // Checking if the HashSet is empty
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());

        // Getting the size of the HashSet
        System.out.println("Size of HashSet: " + hashSet.size());

        // Checking if the HashSet contains a specific element
        System.out.println("Does HashSet contain 'Apple'? " + hashSet.contains("Apple"));

        // Removing an element from the HashSet
        hashSet.remove("Cherry");
        System.out.println("HashSet after removing 'Cherry': " + hashSet);

        // Clearing the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing: " + hashSet);

        // HashSet also supports adding elements from another collection
        HashSet<String> anotherHashSet = new HashSet<>();
        anotherHashSet.add("Apple");
        anotherHashSet.add("Banana");
        anotherHashSet.add("Cherry");

        hashSet.addAll(anotherHashSet);
        System.out.println("HashSet after adding elements from another HashSet: " + hashSet);

        // HashSet also supports removing elements that satisfy a given condition
        hashSet.removeIf(fruit -> fruit.startsWith("B"));
        System.out.println("HashSet after removing elements starting with 'B': " + hashSet);

        // HashSet also supports converting it to a List or Array
        List<String> hashSetAsList = new ArrayList<>(hashSet);
        System.out.println("HashSet as List: " + hashSetAsList);

        String[] hashSetAsArray = hashSet.toArray(new String[0]);
        System.out.println("HashSet as Array: " + Arrays.toString(hashSetAsArray));

        //----------------------------------------------------------
        //LinkedHashSet
        // Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Checking if the LinkedHashSet is empty
        System.out.println("Is LinkedHashSet empty? " + linkedHashSet.isEmpty());

        // Getting the size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Checking if the LinkedHashSet contains a specific element
        System.out.println("Does LinkedHashSet contain 'Apple'? " + linkedHashSet.contains("Apple"));

        // Removing an element from the LinkedHashSet
        linkedHashSet.remove("Cherry");
        System.out.println("LinkedHashSet after removing 'Cherry': " + linkedHashSet);

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);

        // LinkedHashSet also maintains the insertion order of elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        System.out.println("LinkedHashSet after adding elements: " + linkedHashSet);

        // LinkedHashSet also supports removing elements that satisfy a given condition
        linkedHashSet.removeIf(fruit -> fruit.startsWith("B"));
        System.out.println("LinkedHashSet after removing elements starting with 'B': " + linkedHashSet);

        // LinkedHashSet also supports converting it to a List or Array
        List<String> linkedHashSetAsList = new ArrayList<>(linkedHashSet);
        System.out.println("LinkedHashSet as List: " + linkedHashSetAsList);

        String[] linkedHashSetAsArray = linkedHashSet.toArray(new String[0]);
        System.out.println("LinkedHashSet as Array: " + Arrays.toString(linkedHashSetAsArray));
    }
}
