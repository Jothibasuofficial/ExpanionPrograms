
import java.util.*;


public class Answer implements BoundaryTraverseTree {

	@Override
	public List<Integer> BoundaryTraverse(Node root) {
	
	       Stack<Node> stack = new Stack<Node>();
    List<Integer> result = new ArrayList<Integer>();

    Node p = root;
    while(p!=null){
        stack.push(p);
        p = p.lChild;
    }

    while(!stack.isEmpty()){
        Node t = stack.pop();
        result.add(t.nodeValue);

        if(t.rChild!=null){

            t= t.rChild;
            while(t!=null){
                stack.push(t);
                t=t.lChild;
            }
        }
    }

    return result;
}
    
}

