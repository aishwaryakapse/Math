/*Check whether a number is a power of two
 * Right shift and left shift, the no must be same 
 * as long as it is > 10 (2 decimal)
 */
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if(n <= 0) {
			return false;
		}
		
		if(n == 1) {
			return true;
		}
		
		while(n >= 2) {
			int t = n >> 1;
			int c = t << 1;
			if(n - c != 0) {
				return false;
			}
			n = n >> 1;
		}
		return true;
	}
	public static void main(String[] args) {
		PowerOfTwo pot = new PowerOfTwo();
		System.out.println(pot.isPowerOfTwo(6));
		System.out.println(pot.isPowerOfTwo(16));
	}

}
