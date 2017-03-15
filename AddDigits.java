
public class AddDigits {
	public int addDigits(int n) {
		int sum = 0;
		String s = String.valueOf(n);
		for(int i=0; i<s.length(); i++) {
			sum = sum + (s.charAt(i) - '0');
		}
		
		if(sum < 10) {
			return sum;
		}else {
			return addDigits(sum);
		}
	}
	
	public static void main(String[] args) {
		AddDigits ad = new AddDigits();
		System.out.println(ad.addDigits(1234));
	}

}
