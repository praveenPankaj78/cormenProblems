package cormenProblems;

public class Subarray {
	
	int start_index;
	int end_index;
	int sum;
	
	public int getStart_index() {
		return start_index;
	}
	public void setStart_index(int start_index) {
		this.start_index = start_index;
	}
	public int getEnd_index() {
		return end_index;
	}
	public void setEnd_index(int end_index) {
		this.end_index = end_index;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		return "start_index = " + this.start_index + ",  end_index = " + this.end_index + ",  sum = " + this.sum;
	}
	
	

}
