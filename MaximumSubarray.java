package cormenProblems;

import java.util.ArrayList;

public class MaximumSubarray {

	private static Subarray output;

	public MaximumSubarray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(-3);
		arr.add(1);
		arr.add(-8);
		arr.add(4);
		arr.add(-1);
		arr.add(2);
		arr.add(1);
		arr.add(-5);
		arr.add(5);
		
		output = findMaxSubArray(0, arr.size()-1, arr);
		
		System.out.println(output);
		
	}

	private static Subarray findMaxSubArray(int start_index, int end_index, ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		Subarray output = new Subarray();
		Subarray left = new Subarray();
		Subarray right = new Subarray();
		Subarray mid = new Subarray();
		
		if(start_index == end_index) {
			output.setStart_index(start_index);
			output.setEnd_index(end_index);
			output.setSum(arr.get(start_index));
		}
		else {
			int midIndex = (start_index + end_index)/2;
			left = findMaxSubArray(start_index, midIndex, arr);
			right = findMaxSubArray(midIndex+1, end_index, arr);
			mid = findMaxMidSubArray(start_index, midIndex, end_index, arr);
			
			if(left.sum >= right.sum && left.sum >= mid.sum) {
				output = left;
			}
			else if(right.sum >= left.sum && right.sum >= mid.sum ) {
				output = right;
			}
			else {
				output = mid;
			}
			
		}
		
		
		return output;
	}

	private static cormenProblems.Subarray findMaxMidSubArray(int start_index, int midIndex, int end_index,
			ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		Subarray output = new Subarray();
		int leftSum = Integer.MIN_VALUE; 
		int rightSum = Integer.MIN_VALUE;
		int leftIndex = 0; 
		int rightIndex = 0;
		int sum = 0;
		
		for(int i = midIndex; i >= start_index; --i) {
			sum = sum + arr.get(i);
			if(sum > leftSum) {
				leftSum = sum;
				leftIndex = i;
			}
		}
		
		sum = 0;
		
		for(int i = midIndex+1; i <= end_index; ++i) {
			sum = sum + arr.get(i);
			if(sum > rightSum) {
				rightSum = sum;
				rightIndex = i;
			}
		}
		
		output.setStart_index(leftIndex);
		output.setEnd_index(rightIndex);
		output.setSum(leftSum + rightSum);
		
		return output;
	}

}
