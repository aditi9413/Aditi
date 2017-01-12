package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelHavingMaximumNodes {
      static Node root;
	public static void main(String[] args) {
		LevelHavingMaximumNodes tree = new LevelHavingMaximumNodes();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println("Maximum number nodes level in binary tree is= "+Count(root));

	}
	public static int Count(Node root){
		if(root==null){
			return 0;
		}
		Queue <Node> q = new LinkedList<>();
		q.add(root);
		int level=0;
		int max=Integer.MIN_VALUE;
		int ans=0;
		while(!q.isEmpty()){
			int nodecount=q.size();
			if(nodecount>max){
				max=nodecount;
				ans=level;
			}
			if (nodecount == 0)
	            break; 
	        while (nodecount > 0)
	        {
	            root=q.poll();
	            if (root.left != null)
	                q.add(root.left);
	            if (root.right != null)
	                q.add(root.right);
	            nodecount--;
	        } 
	        level++;
		}
		return ans;
	}

}
