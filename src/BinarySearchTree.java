
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
			    return 1+ Math.max(height(root.left),
			    		height(root.right));   
    }
	
	static int findNoOfElements(Node root){
		if(root == null)
			return 0;
			else
				return 1+findNoOfElements(root.left)+findNoOfElements(root.right);
		
	}
	static int findSumOfElements(Node root){
		if(root == null)
			return 0;
			else{
				//int leftsum=root.data + 
				return root.data+findSumOfElements(root.left)+findSumOfElements(root.right);
			}
	}
	
	static void printLevelOrder(Node root){
		int h=height(root);
		for(int i=0;i<=h;i++)
			getLevelOrder(root,i);
	}
	
	 private static void getLevelOrder(Node root,int level) {
		// TODO Auto-generated method stub
		if(root==null)
			return;
		if(level==1)
			System.out.println(root.data+",");
		else if (level>1){
			getLevelOrder(root.left,level-1);
			getLevelOrder(root.right,level-1);
		}
		 
		 
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
	        printLevelOrder(root);
	        System.out.println("No of elements-"+findNoOfElements(root));
	        System.out.println("Sum of elements-"+findSumOfElements(root));

	    }	

}
