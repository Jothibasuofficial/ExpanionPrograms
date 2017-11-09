public class Answer implements PalindromeListInterface 
{ 
    @Override 
     public boolean CheckPalindrome(Node node) {
     
	   Node middleNode=findMiddleNode(node);  
	  
	  Node secondHead=middleNode.nextNode;  
	  
	  middleNode.nextNode=null;  
	  
	  Node reverseSecondHead=reverseLinkedList(secondHead);  
	  
	  while(node!=null && reverseSecondHead!=null)  
	  {  
	   if(node.nodeValue==reverseSecondHead.nodeValue)  
	   {  
	    node=node.nextNode;  
	    reverseSecondHead=reverseSecondHead.nextNode;  
	    continue;  
	   }  
	   else  
	   {  
	    return false;  
	   }  
	  }
	  return true;
     }
      public static Node findMiddleNode(Node head)  
	 {  
	   Node slowPointer, fastPointer;   
	  slowPointer = fastPointer = head;   
	  
	  while(fastPointer !=null) {   
	   fastPointer = fastPointer.nextNode;   
	   if(fastPointer != null && fastPointer.nextNode != null) {   
	    slowPointer = slowPointer.nextNode;   
	    fastPointer = fastPointer.nextNode;   
	   }   
	  } 
	  return slowPointer;
	 }
	  public static Node reverseLinkedList(Node currentNode)    
	 {    
	 
	  Node previousNode=null;    
	  Node next1;    
	  while(currentNode!=null)    
	  {    
	   next1=currentNode.nextNode;    
	      
	   currentNode.nextNode=previousNode;    
	       
	   previousNode=currentNode;    
	   currentNode=next1;    
	  }    
	  return previousNode;    
	 }   
}
