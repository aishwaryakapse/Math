//Ugly Number
import java.util.*;
public class UglyNumber {
	
	/*
	 * Write a program to check whether a given number is an ugly number. 
	 * Ugly numbers are positive numbers whose prime factors only include 
	 * 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it 
	 * includes another prime factor 7. Note that 1 is typically treated 
	 * as an ugly number.
	 */
	
	public boolean isUgly(int num) {
	    if(num==0) return false;
	    if(num==1) return true;
	 
	    if(num%2==0){
	        num=num/2;
	        return isUgly(num);
	    }
	 
	    if(num%3==0){
	        num=num/3;
	        return isUgly(num);
	    }
	 
	    if(num%5==0){
	        num=num/5;
	        return isUgly(num);
	    }
	 
	    return false;
	}
	
	/*
	 * Write a program to find the n-th ugly number. Ugly numbers 
	 * are positive numbers whose prime factors only include 
	 * 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the 
	 * sequence of the first 10 ugly numbers. Note that 1 is 
	 * typically treated as an ugly number.
	 */
	public int nthUglyNumber(int n) {
	    if(n<=0)
	        return 0;
	 
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(1);
	 
	    int i=0;
	    int j=0;
	    int k=0;
	 
	    while(list.size()<n){
	        int m2 = list.get(i)*2;
	        int m3 = list.get(j)*3;
	        int m5 = list.get(k)*5;
	 
	        int min = Math.min(m2, Math.min(m3, m5));
	        list.add(min);
	 
	        if(min==m2)
	            i++;
	 
	        if(min==m3)
	            j++;
	 
	        if(min==m5)
	            k++;
	    }
	 
	    return list.get(list.size()-1);
	}
	
	public static void main(String[] args) {
		UglyNumber un = new UglyNumber();
		System.out.println(un.isUgly(6));
		System.out.println(un.nthUglyNumber(10));
	}
}
