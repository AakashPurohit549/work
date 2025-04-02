package stringandarrays;

public class RevStr {
	public static void main(String[] args) {
		String str = "Hello";
		//rev(str);
		
		int x = 2033;
		//corrected version
		if(x  % 4 == 0) {
			boolean ans = (x % 400 == 0 || x % 100 != 0)?true:false;
		System.out.println(ans);
		if(ans == true) {
			System.out.print("Only prints if the ans is true ");
		}
			
		}
		else {
			System.out.println("Not a leap year");
		}	
		
		
//		if(x%4 == 0) {
//			if(x%400==0 || x%100!=0 ) {
//				System.out.println("Leap year");
//			}
//		}
//		else {
//			System.out.println("Not a leap year");
//		}
		
	}
	
	public static void rev(String str) {
		char[] carr = str.toCharArray();
		
		int l = 0;
		int r = carr.length-1;
		
		while(l<r) {
			char temp = carr[l];
			carr[l] = carr[r];
			carr[r] = temp;
			
			l++;
			r--;
		}
		
		for(int i=0; i<carr.length; i++) {
			System.out.print(carr[i]);
		}
		
	}
	

}
