/*
 * Divide two integers without using multiplication, division and mod 
 * operator. If it is overflow, return MAX_INT.
 * 
 * This problem can be solved based on the fact that any number can be 
 * converted to the format of the following:

num=a_0*2^0+a_1*2^1+a_2*2^2+...+a_n*2^n
 */

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		//handle special cases
		if(divisor == 0) {
			return Integer.MAX_VALUE;
		}
		
		if(divisor == -1 && dividend == Integer.MIN_VALUE) {
			return Integer.MAX_VALUE;
		}
		
		//get positive
		long pDividend = Math.abs((long)dividend);
		long pDivisor = Math.abs((long)divisor);
		
		int result = 0;
		while(pDividend >= pDivisor) {
			int numShifts = 0;
			while(pDividend>=(pDivisor << numShifts)) {
				numShifts++;
			}
			//dividend minus the largest shifted divisor
			result = result + (1 << (numShifts - 1));
			pDividend = pDividend-(pDivisor << (numShifts - 1));
		}
		
		if((dividend>0 && divisor>0) || (dividend < 0 && divisor < 0)) {
			return result;
		}else {
			return -result;
		}
	}
	
	public static void main(String[] args) {
		DivideTwoIntegers dti = new DivideTwoIntegers();
		System.out.println(dti.divide(12, -3));
		System.out.println(dti.divide(12, 4));
	}

}
