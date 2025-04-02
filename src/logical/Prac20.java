package logical;

public class Prac20 {
	public static void main(String[] args) {
		String str = "Hello Welcome to Programming";
	    String revStr ="";
	    String[] words = str.split(" ");
	
	for(String s : words) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		sb.append(" ");
		revStr += sb;
	}
	System.out.println(revStr);
		
	}
	
}
