package logical;

public class LastIndexSubstring {
	
	public static void main(String[] args){
		String str  = "xyzabcswabc";
		String findStr = "abc";
		str.toString();
		int lastIndex = 0;
		int count = 0;
		
		while(lastIndex != -1 ) {
			lastIndex = str.indexOf(findStr,lastIndex); // first occurrence
			System.out.println(lastIndex);  
			
			if(lastIndex != -1 ) { //check for found
				count++; //increasing the count
				System.out.println(" Occurence of substirng at index in the string -> " + lastIndex);
				lastIndex = lastIndex + findStr.length(); //updating the index to searchFrom;
			}
			
		}
		System.out.println(count);
		
	}

}
