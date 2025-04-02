package logical;

public class MaxAndSecndMax {

	public static void main(String[] args) {
		int[] arr = {2,6,4,8,7,5,3,54,12,14,86};
		int ans = findMax(arr);
		System.out.println("Maximum number " + ans);
		int ans2 = secMax(arr);
		System.out.println("second maximum number "+ans2);
		
		
	}
	
	public static int findMax(int[] arr) {
		int mx = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > mx) {
				mx = arr[i];
			}
		}
		return mx;
	}
	
	public static int secMax(int[] arr) {
		int mx = findMax(arr);
		int secondmax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > secondmax && arr[i] <mx) {
				secondmax = arr[i];
			}
		}
		return secondmax;
	}
}
