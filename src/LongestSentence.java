
public class LongestSentence {


public static void main(String args[]){
		System.out.println("Final solution --"+solution("a .  . .  .  ?  !"));
	}
	
	
	public static int solution(String S){
		int maxWordCount=0;
		int length=0;
	
		String[] splits = S.split("[.?!]");
		System.out.println(splits.length);
		for (int i=0;i<splits.length;i++){
			System.out.println(splits[i].trim());
			
			String[] words = splits[i].trim().split("\\s+");
			if(words.length==1){
				if(words[0].length()==0)
					length=0;
				else
					length = words.length;
			}
			else
				length=words.length;
			System.out.println("Count-->"+length);
			if(maxWordCount<length)
				maxWordCount=length;
		}
		return maxWordCount;
	}
}
