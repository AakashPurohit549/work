package stringandarrays;

import java.util.Arrays;
import java.util.HashMap;

public class RotateArrAndAnnagram {
	public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6};
	HashMap<String, Integer> myMap = new HashMap<>();
	myMap.put("Diaglouges", 100);
	myMap.put("Anetlects", 200);
	myMap.put("The Prince", 300);
	myMap.put("The Prince", 400); //old value is replaced the new value
	System.out.println(myMap.entrySet());
	int bs = Arrays.binarySearch(arr, 6);
	System.out.println(bs + " -> val from binary search");
	for(int i : arr) {
		System.out.print(i + " ");
	}
	
	String s = "dusty";
	String t = "study";
	boolean val = isAnagram(s,t);
	System.out.print(val);
	String str  = new String("JavaLang");
	StringBuffer sbf = new StringBuffer();
	int mycap = sbf.capacity();
	System.out.println(mycap);
	int ans = str.indexOf("vaLa");
	boolean my = str.contains("f");
	char c = str.charAt(3); //returns the char at specified index;
	System.out.println(c);
	System.out.println(my);
	System.out.println(ans);
	
	int[] myClone = arr.clone();
	
	//rotate2(arr,k);
	for(int i : myClone) {
		System.out.print(i + " ");
	}
    }
	
	public static void rotate(int[] arr ,int k) {
		int n = arr.length;
		k %=n; 
		
		// reverse the first part 
		reverse(arr, 0 , k-1);
		
		//reverse the second part
		reverse(arr, k , n-1);
		
		//reverse the whole array
		reverse(arr,0,n-1);
		
	}
	
	public static boolean isAnagram(String s , String t) {
		int[] alphabets = new int[26];
		
		for(int i=0; i<s.length(); i++) alphabets[s.charAt(i) - 'a']++;
		for(int i=0; i<t.length(); i++) alphabets[t.charAt(i) - 'a']--;
		for(int i : alphabets) if(i != 0) return false;
		
		return true;
		
	}
	
	public static void reverse(int[] arr , int start , int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
		
	}
	
	public static void rotate2(int[] arr,int k){
        int n =arr.length;
        for(int i=0; i<k; i++){
            int first = arr[0];
            for(int j=0; j<n-1; j++){
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
	}
}
