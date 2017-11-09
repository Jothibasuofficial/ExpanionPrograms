	public Node  ShuffleMergeLists(Node node1, Node node2) {
Node node1nextNode = null, node2nextNode = null, head = null;
if(node1== null)
return node2;
if(node2==null)
return node1;
		if (node1 != null && node2 != null) {
			head = node1;
			while (node1 != null && node2 != null) {
				if (node1.nextNode == null && node2.nextNode == null) {
					node1.nextNode = node2;
					break;
				}
				node1nextNode = node1.nextNode;
				node2nextNode = node2.nextNode;
				if (node1nextNode == null && node2nextNode != null) {
					node1nextNode = node2nextNode;
					node1.nextNode = node2;
					node2.nextNode = node1nextNode;
					break;
				}
				node1.nextNode = node2;
				node2.nextNode = node1nextNode;
				node1 = node1nextNode;
				node2 = node2nextNode;
			}
		}
		return head;
	}