
public class ReverseInteger {
	//Does not consider negative numbers
	public int reverse(int x) {
		int rev =0;
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x/10;
		}
		return rev;
	}
	
	public int reverseBetter(int x) {
		//flag marks if x is 
		boolean flag = false;
		if(x < 0) {
			x = 0- x;
			flag = true;
		}
		
		int res = 0;
		int p = x;
		
		while(p > 0) {
			int mod = p % 10;
			p = p / 10;
			res = res * 10 + mod;
		}
		
		if(flag == true) {
			res = 0 - res;
		}
		return res;
	}
	
	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		int x = 74353;
		System.out.println(ri.reverse(x));
		System.out.println(ri.reverseBetter(x));
		x = -4323;
		System.out.println(ri.reverse(x));
		System.out.println(ri.reverseBetter(x));
		int z = -0;
		System.out.println(z == 0);
	}
}
