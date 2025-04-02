package logical;
// Bitwise operators questions
public class BitManipulation {
	
	public static void main(String[] args) {
		int n = 11;
		//System.out.println(getBit(n,3));
		
		//System.out.println(setBit(n,1));
		
		int n2 = 3;
		String bin = Integer.toBinaryString(n2);
		System.out.println(bin);
		
		//resetBit(n,1);
		
		//System.out.println(powOfTwo(n2));
		System.out.println(altBits(10));
		binToDeci(1111);
		
	}
	
	public static int getBit(int n, int pos) {
		int bitMask = 1 << pos;
		int ans = n & bitMask;
		int result = ans > 0 ? 1 : 0;
		System.out.println(result);
		return result;
	}
	
	//set bit 
	public static int setBit(int n, int pos) {
		int bitMask = 1 << pos;
		int ans = n | bitMask;
		System.out.println(ans);
		return ans;
	}
	
	public static int resetBit(int n, int pos) {
		int bitMask = 1 << pos;
		int ans = n ^ bitMask;
		System.out.println(ans);
		return ans;
	}
	
	//find if a number is power of 2
	public static boolean powOfTwo(int n) {
		return (n !=0 ) && ((n & (n-1)) == 0);
	}
	
	//for checking all bits are set
	public static boolean allBitsSet(long n) {
		if ((((n+1) & n) == 0)) {
			return true;
		}
		return false;
	}
	
	//for alternate pattern
	public static boolean altBits(long n) {
	long num = n ^ (n >> 1);
	boolean result =  allBitsSet(num);
	return result;
	
	}
	
	public static void binToDeci(int num) {
		int pow =0;
		int deci =0;
		while(num > 0) {
			int lastDigit = num % 10;
			deci = deci + (lastDigit * (int)Math.pow(2,pow));
			pow++;
			num = num/10;	
		}
		System.out.println(deci);
	}

}
