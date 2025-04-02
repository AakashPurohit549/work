package stringandarrays;

public class StringPractice {
	
	public static void  main(String[] args) {
		String str = "abdfj";
		String str2 = "abc,def,ghi,lmno,pq";
		String my = "abcde";
		findDiff(str);
		csvFun(str2,3);
	
		char[] c = new char[2];
		System.out.println(c[0]);
	}
	
	public static void findDiff(String str) {
		char[] arr = str.toCharArray();
		
		int diff = 0;
		for(int i=0; i<arr.length-1; i++) {
			diff = arr[i+1] - arr[i]-1;
			if(diff < 0) {
				diff = +diff +1;
			}
			System.out.println("Difference between " + arr[i] + " and " + arr[i+1] + " is -> " + diff);
		}
		
	}
	
	
	
	
	public static void csvFun(String str , int idx) {
		String[] arr = str.split(",");
		
		for(int i=0; i<arr.length; i++) {
			if(idx == i) {
				System.out.println(arr[i]);
			}
		}
	}

}
