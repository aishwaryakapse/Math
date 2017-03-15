
public class Pow {
	public double pow(double x, int n) {
		
		if(n == 0) {
			return 1;
		}
		
		if(n == 1) {
			return x;
		}
		
		int pn = n > 0 ? n : -n;
		int pn2 = pn;
		
		double px = x > 0 ? x : -x;
		double result = px;
		
		int k = 1;
		while(pn/2 > 0) {
			result = result * result;
			pn = pn / 2;
			k = k*2;
		}
		
		result = result * pow(px, pn2 - k);
		
		//handle negative
		if(x < 0 && n % 2 == 1) {
			result = -result;
		}
		
		if(n < 0) {
			result = 1 / result;
		}
		return result;
	}
	public static void main(String[] args) {
		Pow p = new Pow();
		System.out.println(p.pow(7.0, 2));
	}

}
