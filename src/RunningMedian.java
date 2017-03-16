import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RunningMedian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		in.nextLine();
		Integer[] inputs = new Integer[t];
		for(int i=0;i<t;i++){
			inputs[i] = in.nextInt();
		}
			printRunningMedians(inputs);
	}

	private static void printRunningMedians(Integer[] inputs) {
		Arrays.sort(inputs);
		DecimalFormat df = new DecimalFormat("#.#");

		double median;
		for(int i=0;i<inputs.length;i++){
			if (i+1 % 2 == 0)
			    median = ((double)inputs[(i+1)/2] + (double)inputs[(i+1)/2 - 1])/2;
			else
			    median = (double) inputs[(i+1)/2];
			System.out.println(df.format(median));
		}
		
		
	}
	
	

}
