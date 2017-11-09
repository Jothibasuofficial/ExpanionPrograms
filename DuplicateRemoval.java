 
public class Answer implements RemoveDuplicatesInterface 
{ 
     @Override 
        public void DuplicateRemoval(Node headNode) { 
     Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = headNode;
 
        while (ptr1 != null && ptr1.nextNode != null) {
            ptr2 = ptr1;
 
            while (ptr2.nextNode != null) {

                if (ptr1.nodeValue== ptr2.nextNode.nodeValue) { 
                    dup = ptr2.nextNode;
                    ptr2.nextNode = ptr2.nextNode.nextNode;
                    System.gc();
                } else {
                    ptr2 = ptr2.nextNode;
                }
            }
            ptr1 = ptr1.nextNode;
        }
    }
}

