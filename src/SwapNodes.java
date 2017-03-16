import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class SNode {
    SNode left;
    SNode right;
    int data;
    
    SNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class SwapNodes {

	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        n=n*2;
	        SNode root = null;
	        while(n-- > 0){
	            int data = scan.nextInt();
	            root = insert(root, data,n/2);
	        }
	        scan.close();
	        printInOrderTraversal(root);
		    printLevelOrder(root);

	    }
	 
	 private static void printInOrderTraversal(SNode node){

		 System.out.println("printing Nodes...");
	 }
	 
	 public static SNode insert(SNode root, int data, int t) {
	        if(root == null){
	            return new SNode(data);
	        }
	        else if(data == -1){
	        	
	        }
	        else {
	            SNode cur;
	            if(data <= root.data){
	                cur = insert(root.left, data,t);
	                root.left = cur;
	            }
	            else{
	                cur = insert(root.right, data,t);
	                root.right = cur;
	            }
	            return root;
	        }
			return root;
	    }
	 

	 
	 static void printLevelOrder(SNode root){
			int h=height(root);
			for(int i=0;i<=h;i++)
				getLevelOrder(root,i);
		}
		
		 private static void getLevelOrder(SNode root,int level) {
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
	
		 static int height(SNode root) {
			  if(root == null)       
				    return 0;
				  if(root.left == null && root.right==null)      
				    return 1;            
				  else
				    return 1+ Math.max(height(root.left),
				    		height(root.right));   
	    }
}
