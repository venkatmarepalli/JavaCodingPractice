class ANode {
	    ANode left;
	    ANode right;
	    int data;
	    
	    ANode(int data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}
public class AmazonTest1 {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {9,7,5,3,1};
		System.out.println(bstDistance(values,5,7,20));

	}

	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static int bstDistance(int[] values, int n, int node1, int node2)
	{
	    if(!search(node1,values) || !search(node2,values))
	        return -1;
	   else{ 
		   //Inserting nodes
		   ANode root=null; 
		   for(int i=0;i<values.length;i++){
			   if(i==0)
		        root = insert(root,values[i]);
			   else
				   root = insert(root,values[i]);
		   }
		   //Traversing the nodes
		   return findDistance(root,node1,node2);
		   
	   }
	    
	}
	
	public static int findDistance(ANode root, int n1, int n2) {
		int x = Pathlength(root, n1) - 1;
		int y = Pathlength(root, n2) - 1;
		int lcaData = findLCA(root, n1, n2).data;
		int lcaDistance = Pathlength(root, lcaData) - 1;
		return (x + y) - 2 * lcaDistance;
	}

	public static int Pathlength(ANode root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.data == n1) || (x = Pathlength(root.left, n1)) > 0
					|| (x = Pathlength(root.right, n1)) > 0) {
				// System.out.println(root.data);
				return x + 1;
			}
			return 0;
		}
		return 0;
	}

	public static ANode findLCA(ANode root, int n1, int n2) {
		if (root != null) {
			if (root.data == n1 || root.data == n2) {
				return root;
			}
			ANode left = findLCA(root.left, n1, n2);
			ANode right = findLCA(root.right, n1, n2);

			if (left != null && right != null) {
				return root;
			}
			if (left != null) {
				return left;
			}
			if (right != null) {
				return right;
			}
		}
		return null;
	}
	
	public static ANode insert(ANode root, int data) {
        if(root == null){
            return new ANode(data);
        }
        else {
            ANode cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	public static boolean search(int node,int[] values){
	    int ctr=0;
		for(int i=0;i<values.length;i++){
		    if(node== values[i])
		    ctr++;
		}
		if(ctr>=1)
		return true;
		else 
		return false;
	    
	}
}
