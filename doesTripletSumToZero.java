import java.util.*;

public class Answer implements TripletSummingToZeroInterface {

 Stack<Integer> stack = new Stack<Integer>();
	 void traverse(Node root) {
		        
        if (root == null) return;
        
        traverse(root.lChild);
        traverse(root.rChild);
        stack.push(root.nodeValue);        
    }
	public  boolean tsum(Object[] arr,int index, int sum, int k) {
		
		if (k == 0 && sum == 0) return true;
		if (k == 0 && sum != 0) return false;

		if (arr == null || index >= arr.length) return false;
		
		return tsum(arr, index+1, sum+Integer.parseInt(arr[index].toString()), k-1) || tsum(arr, index+1, sum, k); 
	}
   
	@Override
	public boolean doesTripletSumToZero(Node root) {
		
     traverse(root);
	 return tsum(stack.toArray(), 0, 0, 3);
	
		
	}

}
