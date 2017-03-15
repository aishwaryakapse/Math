/*
 * Write an algorithm to determine if a number is "happy".

What is an happy number can be shown in the following example:

19 is a happy number
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
 */

import java.util.*;
public class HappyNumber {
	public boolean isHappyNumber(int n) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while(!hs.contains(n)) {
			hs.add(n);
			n = getSum(n);
			if(n == 1) {
				return true;
			}
		}
		return false;
	}
	
	public int getSum(int n) {
		int sum = 0;
		while(n > 0) {
			sum = sum + (n%10) * (n%10);
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		HappyNumber hn = new HappyNumber();
		System.out.println(hn.isHappyNumber(19));
		System.out.println(hn.isHappyNumber(36));
	}
}
