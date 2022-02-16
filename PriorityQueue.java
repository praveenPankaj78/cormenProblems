package cormenProblems;

import java.util.ArrayList;

import algorithms.HeapSortRecursive;

public class PriorityQueue {

	public PriorityQueue() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(15);
		arr.add(13);
		arr.add(9);
		arr.add(5);
		arr.add(12);
		arr.add(8);
		arr.add(7);
		arr.add(4);
		arr.add(0);
		arr.add(6);
		arr.add(2);
		arr.add(1);
		
		heapIncreaseKey(arr, 5, 10);
		maxHeapInsert(arr, 18);
		
		System.out.println(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		heapExtractMax(arr);
		
	}

	// Inserts a new key in the priority queue
	private static void maxHeapInsert(ArrayList<Integer> arr, int key) {
		// TODO Auto-generated method stub
		arr.add(key);
		HeapSortRecursive.maxHeap(arr);
	}

	// Increases the key value of an element 
	private static void heapIncreaseKey(ArrayList<Integer> arr, int index, int key) {
		// TODO Auto-generated method stub
		if(arr.get(index) > key) {
			System.out.println("New key is smaller than current key");
		}
		else {
			arr.set(index, key);
			HeapSortRecursive.maxHeap(arr);
			
		}
	}

	// prints the maximum value of heap and removes it from array
	private static void heapExtractMax(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		if(arr.size() > 0) {
			HeapSortRecursive.maxHeap(arr);
			System.out.println(arr.get(0));
			arr.remove(0);
		}
		else {
			System.out.println("Priority Queue over");
		}
	}

}
