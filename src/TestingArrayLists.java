import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;



public class TestingArrayLists {

	 public static void main(String[] args){
		 ArrayList<ArrayList<Integer>> mainList = new ArrayList<ArrayList<Integer>>();
		 
	        ArrayList<Integer> subList1 = new ArrayList<Integer>();
	        subList1.add(1);
	        subList1.add(2);
	        subList1.add(3);
	        
	        ArrayList<Integer> subList2 = new ArrayList<Integer>();
	        subList2.add(5);
	        subList2.add(5);
	        subList2.add(5);
	        
	        mainList.add(subList1);
	        mainList.add(subList2); //[[1, 2, 4], [3, 2, 1]]
		 
	       for(int i = 0; i < mainList.size(); i++){
	            ArrayList subList = mainList.get(i);
	            for(int j = 0; j < subList.size(); j++){
	                System.out.print(subList.get(j));
	            }
	        }	       
	        
/*	        for(ArrayList<Integer> i:mainList)
	            for(Integer j:i)
	                System.out.print(j);*/
	        
	    }
	
}
