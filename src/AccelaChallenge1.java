import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AccelaChallenge1 {

	/**
	 * @param args
	 */
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        
	        int _arr_size = 0;
	        _arr_size = Integer.parseInt(in.nextLine().trim());
	        int[] _arr = new int[_arr_size];
	        int _arr_item;
	        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	            _arr_item = Integer.parseInt(in.nextLine().trim());
	            _arr[_arr_i] = _arr_item;
	        }
	        int[] data = {5,3,1,2,2,4};
	        System.out.println("Before");
	       customSort(data);
	       System.out.println("testing");

	    }
	
	 static void customSort(int[] arr) {
	        ArrayList<Integer> subList = new ArrayList<Integer>();  
	        ArrayList<Integer> mainList = new ArrayList<Integer>();

	        //Find Frequency of the numbers starting from 1 
	        int n=arr[0];
	        int count =0;
	        for(int i=1;i<=n;i++){
	            count=0;
	            for(int j=1;j<=n;j++){
	            	count=0;
	                for(int k=1;k<=n;k++){
	                    if(arr[j]==arr[k])
	                        count++;
	                }
	                if(count==i)
	                    subList.add(arr[j]);
	            }
	            //Sort and add sublist to main list 
	            Collections.sort(subList);	           
	            for(Integer value:subList){ 
	                    mainList.add(value);
		            }
	            subList.clear();
		        }
	         
	           
	       	       
	        //Print the elements on screen
	        for(Integer i:mainList){ // iterate -list by list
                    System.out.println(i);
	        }
	            
    }


	    }


