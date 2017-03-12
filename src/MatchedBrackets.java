import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatchedBrackets {
	
	 private static final HashMap<Character, Character> brackets = new HashMap<Character, Character>();
	    static {
	        brackets.put('[', ']');
	        brackets.put('{', '}');
	        brackets.put('(', ')');
	    }  


    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String[] inputs = new String[t];
        for(int a0 = 0; a0 < t; a0++){
        	inputs[a0] = in.next();
        }
        for(String s:inputs){
        if(isBalanced(s))
        	System.out.println("YES");
        else
        	System.out.println("NO");
        
        
       /* if(checkForBalancedBrackets(s))
        	System.out.println("My-->YES");
        else
        	System.out.println("My-->NO");*/
        }
        
    }

	private static boolean checkForBalancedBrackets(String s) {
		boolean result=false;
			if(!Pattern.matches("[\\[\\]\\{\\}\\(\\)]+", s))
				result= false;
					else if(s.length()%2 != 0)
						result= false;
					else {
						for(int i=0,j=s.length();i<j;i++,j--){
						CharSequence cs = s.valueOf(s.charAt(i))+ s.valueOf(s.charAt(j-1));
						if(Pattern.matches("(\\{\\}|\\[\\]|\\(\\))",cs ))
							result = true;
						else{
							result= false;
							break;
							}
						}
					}
			return result;
	}
	
	 public static boolean isBalanced(String str) {
	        if (str.length() == 0) {
	            throw new IllegalArgumentException("String length should be greater than 0");
	        }
	        // odd number would always result in false
	        if ((str.length() % 2) != 0) {
	            return false;
	        }

	        	
	        final Stack<Character> stack = new Stack<Character>();
	        
	        for (int i = 0; i < str.length(); i++) {
	        	
	            if (brackets.containsKey(str.charAt(i))) {
	                stack.push(str.charAt(i));
	            } else if (stack.empty() || (str.charAt(i) != brackets.get(stack.pop()))) {
	                return false;
	            } 
	        }
	        if(stack.isEmpty())
	        return true;
	        else 
	        	return false;
	    } 

	private static boolean noValidString(String s) {
		CharSequence matcher = "{}()[]";
		for(int i=0;i<matcher.length();i++){
			if(!s.contains(matcher.subSequence(i, i+1)))
				return false;
		}	
		return false;
	}
	
	
}