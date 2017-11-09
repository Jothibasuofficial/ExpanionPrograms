	public Node SwapEveryTwoNodesInLinkedList(Node head) {
                  if (head == null)
          		  return null;
   	 if (head.nextNode == null)
   		     return head;

  	  Node previous = null;
   	 Node current = head;
                	  Node next = head.nextNode;

                while (next != null && next != current)
	 {
       		 current.nextNode = next.nextNode;
     		 next.nextNode = current;
     	                  if (previous == null) 
		{
           			 previous = next;
           			 head = previous;
          			  previous = previous.nextNode;
      		  } 
		else
		 {
        		  	    previous.nextNode = next;
          			   previous = previous.nextNode.nextNode;
  	                   }
                                   current = current.nextNode;
                                  if (current == null)
                                                         break;
                                  next = next.nextNode.nextNode.nextNode;

                 }
                  return head;

}