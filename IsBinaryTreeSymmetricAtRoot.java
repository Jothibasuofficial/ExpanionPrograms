	public boolean IsBinaryTreeSymmetricAtRoot(Node node) {
  
    if(node==null)
        return true;
    return isSymmetricLR(node.lChild,node.rChild);
}
public static boolean isSymmetricLR(Node lChild, Node rChild){
    if(lChild == null && rChild == null)
        return true;
    if(lChild!=null && rChild!=null)
        return ((isSymmetricLR(lChild.lChild, rChild.rChild)) &&
                (isSymmetricLR(lChild.rChild, rChild.lChild)));
    return false;
}