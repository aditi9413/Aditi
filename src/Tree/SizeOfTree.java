package Tree;

public class SizeOfTree {
	 static Node root;
	 SizeOfTree()
	    {
	        root = null;
	    }
 public static int size(Node root){
	  if(root==null){
		 return 0; 
	  }
	  int lsize=size(root.left);
	  int rsize=size(root.right);
	  return 1 + lsize + rsize;
 }
	public static void main(String[] args) {
		SizeOfTree tree = new SizeOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Size of binary tree is " +tree.size(root));
	}

}
