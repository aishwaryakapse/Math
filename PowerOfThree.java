
public class PowerOfThree {
	//Iteration
	public boolean isPowerOfThree(int n) {
		if(n == 1) {
			return true;
		}
		while(n > 0) {
			int m = n%3;
			if(m == 0) {
				n = n/3;
				if(n == 1) {
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	// Recursion
	public boolean isPOThree(int n) {
		if(n == 0) {
			return false;
		}
		if(n == 1) {
			return true;
		}
		if(n > 1) {
			return n%3 == 0 && isPOThree(n/3);
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		PowerOfThree po3 = new PowerOfThree();
		System.out.println(po3.isPOThree(9));
		System.out.println(po3.isPowerOfThree(9));
		System.out.println(po3.isPOThree(7));
		System.out.println(po3.isPowerOfThree(5));
	}

}
