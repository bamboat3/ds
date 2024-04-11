
public class Driver {

	public static void main(String[] args) {
		int[] x = {14, 15, 4, 9, 7, 18, 3, 5, 16,4, 20, 17,9, 14,5, -1};
		TreeNode<Integer> root = new TreeNode<Integer>();
		root.setInfo(x[0]);
		
		for(int i=1;x[i]>0;i++) {
			insert(root,x[i]);
		}
		
		System.out.println();
		System.out.println("Printing Binary Tree");
		BTreePrinter.printNode(root);
		
	}//end main

	static void insert(TreeNode<Integer> root,int info) {
		TreeNode<Integer> node = new TreeNode<Integer>(info);
		TreeNode<Integer> p, q;
		p = q = root;
		
		while( (info != Integer.valueOf(p.getInfo().toString()).intValue()) &&
					q != null)
		{
			p = q;
			if(info < (Integer.valueOf(p.getInfo().toString())).intValue())
				q = p.getLeft();
			else
				q = p.getRight();
		}//end while end
		
		if(info == Integer.valueOf((p.getInfo()).toString()).intValue())
		{
			System.out.println("attempt to insert duplicate: "+info);
		}
		else if(info < Integer.valueOf((p.getInfo()).toString()).intValue())
		{
			p.setLeft(node);
		}
		else {
			p.setRight(node);
		}
		
	}//end insert
}//end Driver
