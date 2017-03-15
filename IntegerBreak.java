/*
 * Given a positive integer n, break it into the sum of at least two 
 * positive integers and maximize the product of those integers. 
 * Return the maximum product you can get.

For example, given n = 2, return 1 (2 = 1 + 1); given n = 10, return 
36 (10 = 3 + 3 + 4).
 */
public class IntegerBreak {
	/*
	 * If we see the breaking result for some numbers, we can see 
	 * repeated pattern like the following:

2 -> 1*1
3 -> 1*2
4 -> 2*2
5 -> 3*2
6 -> 3*3
7 -> 3*4
8 -> 3*3*2
9 -> 3*3*3
10 -> 3*3*4
11 -> 3*3*3*2
We only need to find how many 3's we can get when n> 4. If n%3==1, 
we do not want 1 to be one of the broken numbers, we want 4.
	 */
	public int integerBreak(int n) {
		if(n == 2) return 1;
		if(n == 3) return 2;
		if(n == 4) return 4;
		
		int result = 1;
		if(n%3 == 0) {
			int m = n/3;
			result = (int)Math.pow(3, m);
		}else if(n%3 == 2) {
			int m = n/3;
			result = (int)Math.pow(3, m)*2;
		}else if(n%3 == 1) {
			int m = (n-4)/3;
			result = (int)Math.pow(3, m)*4;
		}
		return result;
	}
	public static void main(String[] args) {
		IntegerBreak ib = new IntegerBreak();
		System.out.println(ib.integerBreak(11));
	}

}
