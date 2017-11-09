
import java.util.*;

public class Answer implements QuestionInterface {
    
    public int t(Node tree, Stack<Integer> stack) {
		
	     if (tree == null) 
	        return 0;
	        
	     t(tree.lChild, stack);
	     stack.push(tree.nodeValue);
	     t(tree.rChild, stack);
	     
	     return 0;
	}
	
	@Override
	public int func(Node tree, int k)
	{
	    
	  Stack<Integer> stack = new Stack<Integer>();
		
	  t(tree, stack);
	   int e = 0;
	   for (int i = k; i > 0; i--) {
		   
		   e += stack.peek();
		   stack.pop();
	   }
	    
	   return e;
	}
}
