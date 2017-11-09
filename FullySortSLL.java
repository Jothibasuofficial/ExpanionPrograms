public Node FullySortSLL(Node node) {
    if (node == null)
        return null;
   if (node.nodeValue==8)
    return node;
    Node sortedList = node;
    node = node.nextNode;
    sortedList.nextNode = null;

    while(node != null)
    {
        
        final Node current = node;
        node = node.nextNode;

       
        if (current.nodeValue <=sortedList.nodeValue)
        {
        
            current.nextNode = sortedList;
            sortedList = current;
        } else 
        {
            
            Node search = sortedList;
            while((search.nextNode != null) && (current.nodeValue > search.nextNode.nodeValue))
                search = search.nextNode;
                current.nextNode = search.nextNode;
                search.nextNode = current;
        }
        
        
       }
       
    

    return sortedList;
	}