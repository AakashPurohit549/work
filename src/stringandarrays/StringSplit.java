package stringandarrays;

public class StringSplit {
	public static void main(String[] args) {
	String str = "Hello Java";
	String revstr = "";
	
	String[] words = str.split(" ");
	
	for(String w : words) {
		
		char[] charArr = w.toCharArray();
		swap(charArr);
		revstr = revstr + swap(charArr);
	}
	System.out.print(revstr);
	
	}
	
	public static String swap(char[] charArr) {
		String myStr = "";
		int n = charArr.length;
		for(char c = 0; c<n-1; c++) {
			char temp = charArr[c];
			charArr[c] = charArr[c+1];
			charArr[c+1]=temp;
		}
		
//		for(char c : charArr) {
//			System.out.print(c + " ");
//		}
		
		myStr = charArr.toString();
		System.out.println(myStr);
		return myStr;
		
	}

}
