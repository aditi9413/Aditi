package Tree;

public class MinNodeOfTree {
	 static Node root;
	  public MinNodeOfTree(){
		   root=null;
	   }
	  public static int MinNode(Node root){
		  if(root==null)
			  return Integer.MIN_VALUE;
		  int min = root.key;
		    int lmin = MinNode(root.left);
		    int rmin = MinNode(root.right);
		    if (lmin < min)
		      min = lmin;
		    if (rmin < min)
		      min = rmin;
		    return min;
	  }
	public static void main(String[] args) {
		MinNodeOfTree tree = new MinNodeOfTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Minimum of binary tree is " +tree.MinNode(root));

	}

}
