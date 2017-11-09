import java.util.*;


public class Answer implements ExtremeNodesInterface {

	@Override
	public List<Integer> PrintExtremeNodesZigZag(Node root) {
		
			List<Integer> list = new ArrayList<Integer>();
			Stack<Node> stack = new Stack<Node>();
			Stack<Node> stack1 = new Stack<Node>();
			Node node = root;
		if(node==null)
		    return null;
		 while(node!=null)
		 {
		    stack.push(node);
		    node = node.lChild;
		 }
		  while(node!=null)
		 {
		    stack1.push(node);
		    node = node.rChild;
		 }
		 while(!stack.isEmpty())
		 {
		     Node value = stack.pop();
		     list.add(value.nodeValue);
		 }
		 while(!stack1.isEmpty())
		 {
		     Node value = stack1.pop();
		     list.add(value.nodeValue);
		 }
	
				
		return list;
	}

}
