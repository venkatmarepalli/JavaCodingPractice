
import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearchTree {

	/**
	 * @param args
	 */
	
	public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
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
	
	static int height(Node root) {
		  if(root == null)       
			    return 0;
			  if(root.left == null && root.right==null)      
			    return 1;            
			  else
			    return height(root.left)+
			    		height(root.right);   
    }
	
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int t = scan.nextInt();
	        Node root = null;
	        while(t-- > 0){
	            int data = scan.nextInt();
	            root = insert(root, data);
	        }
	        scan.close();
	        int height = height(root);
	        System.out.println(height);
	    }	

}
