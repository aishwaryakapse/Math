/*
 * check if an integer is a power of four
 */
public class PowerOfFour {
	public boolean isPowerOfFour(int n) {
		if(n == 0) {
			return false;
		}
		
		if(n == 1) {
			return true;
		}
		
		while(n > 1) {
			int m = n%4;
			if(m ==0) {
				n = n/4;
				if(n == 1) {
					return true;
				}
			}else {
				return false;
			}
 		}
		return false;
	}
	public static void main(String[] args) {
		PowerOfFour po4 = new PowerOfFour();
		System.out.println(po4.isPowerOfFour(6));
	}
}
