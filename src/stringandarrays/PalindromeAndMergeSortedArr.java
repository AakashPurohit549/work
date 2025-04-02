package stringandarrays;
public class PalindromeAndMergeSortedArr {
	public static void main(String[] args){
		int num = 12321;
		int help = 12321;
		
		int rev =0;
		while(num > 0){
			int lastDigit = num % 10;
			rev = (rev * 10) + lastDigit;
			num=num/10;
		}
		
		String ans =(rev == help)?"Palindrome":"Not a Palindrome";
		 System.out.println(ans);		 
		 
		 
		 int[] arr1 = {10,20,30};
		 int[] arr2 = {40,50,60,70};
		 
		 int a = arr1.length;
		 int b = arr2.length;
		 
		 int[] arr3 = new int[a+b];
		 
		 for(int i=0; i<a; i++) {
			 arr3[i] = arr1[i];
		 }
		 for(int i=0; i<b; i++) {
			 arr3[a+i] = arr2[i];
		 }
		 
		 for(int e : arr3) {
			 System.out.print(e);
		 }
		 
		 String ans2 = arr3.toString();
		 System.out.print(ans2);
	}

}
