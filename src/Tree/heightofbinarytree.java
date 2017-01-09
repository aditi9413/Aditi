package Tree;
public class heightofbinarytree {
	 static Node root;
	 heightofbinarytree()
	    {
	        root = null;
	    }
  public static int height(Node root){
	  if(root==null){
		 return 0; 
	  }
	  int lheight=height(root.left);
	  int rheight=height(root.right);
	  return 1 + Math.max(lheight, rheight);
  }
	public static void main(String[] args) {
		heightofbinarytree tree = new heightofbinarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Height of binary tree is " +tree.height(root));
	}

}
