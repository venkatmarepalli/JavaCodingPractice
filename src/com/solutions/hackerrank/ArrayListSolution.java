package com.solutions.hackerrank;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<ArrayList<Integer>> arrLists = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> subList = new ArrayList<Integer>();            
                for(int j=0;j<d;j++){
                    subList.add(sc.nextInt());
                }
            arrLists.add(subList);
        }
        int q=sc.nextInt();
        
        ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<q;i++){
        	
            int x=sc.nextInt();
            int y=sc.nextInt();
            ArrayList<Integer> subOutput = new ArrayList<Integer>();
            subOutput.add(x);
            subOutput.add(y);
            output.add(subOutput);
        }
        
        printOutput(arrLists, output);
        
    }
    
    public static void printOutput(ArrayList<ArrayList<Integer>> input, ArrayList<ArrayList<Integer>> output){
       /* System.out.print("Output and Input--");
    	System.out.print(output.size() + "--");
    	System.out.print(input.size());
    	System.out.println("Sample output--");
    	System.out.println(output.get(2).get(0));*/
    	
    	for(int i=0;i<output.size();i++){    		
    		int indexOfX = (output.get(i).get(0))-1;
    		int indexOfY = (output.get(i).get(1))-1;
    		
    			if(input.get(indexOfX).isEmpty() || input.get(indexOfX).size()<indexOfY)
        		System.out.println("ERROR!");
        	else{
        		System.out.println(input.get(indexOfX).get(indexOfY));
        	}
        }
    }
    
}