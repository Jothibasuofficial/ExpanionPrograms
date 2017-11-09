	public boolean func(Node tree, int k)
	{
		if(tree==null)
		return false;
		else if(k==tree.nodeValue)
		return true;
		else if(k<tree.nodeValue)
	    return func(tree.lChild,k);
	    else
	    return func(tree.rChild,k);
	}