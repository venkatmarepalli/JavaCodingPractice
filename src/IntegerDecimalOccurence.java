
public class IntegerDecimalOccurence {
	
	
public static void main(String args[]){
		
		System.out.println(solution(79,195378678));
		
	}
	
	
	public static int solution(int A, int B){
		String a = Integer.toString(A);
		String b = Integer.toString(B);
		return b.indexOf(a);
		
	}
}
