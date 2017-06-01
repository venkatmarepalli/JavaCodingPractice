package com.solutions.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int asciiVal=97;
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        for(int i=0;i<26;i++){
        	char c = (char)asciiVal++;
            ht.put(c,h[i]);
           }
        Enumeration names;

        names = ht.keys();
        int max =0;
        for(int j=0;j<word.length();j++){
        	char key = word.charAt(j);
        	int value = ht.get(key);
        	if(value>max)
        		max = value;
        }
        System.out.println(max * word.length());
        
    }
}