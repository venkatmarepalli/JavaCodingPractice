package com.solutions.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HighLowRecords {

     static int[] getRecord(int[] s){
        // Complete this function
        int[] records= {0,0};
        int highScoreRecords=s[0];
        int lowScoreRecords=s[0];
        
        for(int i=1;i<s.length;i++){
        	if(s[i]>highScoreRecords){
        		records[0] = records[0]+1;
        		highScoreRecords = s[i];
        	}
        	if(s[i]<lowScoreRecords){
        		records[1] = records[1]+1;
        		lowScoreRecords=s[i];
        	}
        }
        return records;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
