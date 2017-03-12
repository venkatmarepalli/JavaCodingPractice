import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AddFindContacts {

	private static HashMap<String,Integer> contacts = new HashMap<String,Integer>();
	private static ArrayList<String> contacts1 = new ArrayList<String>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		String[] inputs = new String[t];
		for(int i=0;i<t;i++){
			inputs[i] = in.nextLine();
		}
		for(String s:inputs){
			if(Pattern.matches("^(add).+", s))
				addContact(s);
			else if(Pattern.matches("^(find).+",s))
				System.out.println(findContact(s.substring(5, s.length())));
			else
				System.out.println("Nothing matched");
		}
	}

	private static int findContact(String searchPattern) {
		int count=0;
		/*for(String contact:contacts1){
			if(Pattern.matches("^("+searchPattern+").*", contact))
				count++;
		}
		return count;		*/
		
		
		for(String contact:contacts.keySet()){
			if(Pattern.matches("^("+searchPattern+").*", contact))
				count++;
		}
		return count;
	}

	private static void addContact(String s) {
		Random rand = new Random();

		int  n = rand.nextInt(50) + 1;
		contacts.put(s.substring(4,s.length()),n);
		
	}

}
