
public class TreeNode<T > {

	private Object object;
	TreeNode<T> left;
	TreeNode<T> right;
	
	public TreeNode() {
	
		this.object = null;
		this.left = this.right = null;
	}
	
	public TreeNode(Object obj) {
		this.object = obj;
		this.left = this.right = null;
	}

	Object getInfo() {
		return this.object;
	}//end getInfo
	
	void setInfo(Object obj) {
		this.object = obj;
	}//end setInfo
	
	TreeNode<T> getLeft() {
		return this.left;
	}//end getLeft
	
	void setLeft(TreeNode<T> left)
	{
		this.left = left;
	}//end setLeft
	
	TreeNode<T> getRight() {
		return this.right;
	}//end getRight
	
	void setRight(TreeNode<T> right) {
		this.right = right;
	}//end setRight
	
	boolean isLeaf() {
		if(this.left==null && this.right == null)
			return true;
		return false;
	}//end isLeaf
	
	
}//end class
