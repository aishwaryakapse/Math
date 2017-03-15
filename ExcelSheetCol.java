
public class ExcelSheetCol {
	/*
	 * Given a column title as appear in an Excel sheet, 
	 * return its corresponding column number. For example:

	    A -> 1
	    B -> 2
	    C -> 3
	    ...
	    Z -> 26
	    AA -> 27
	    AB -> 28 
	    ...
	    AAA -> 703 
	 */
	/*
	 * Starting from the right-hand side, the converted value 
	 * for each character is the mapping integer * 26 to the 
	 * t-th power, where t starts from 0.
	 */
	//Title To Number
	public int titleToNumber(String s) {
		if(s == null || s.length() == 0) {
			throw new IllegalArgumentException("Input is n ot valid");
		}
		
		int result = 0;
		int i = s.length() - 1;
		int t = 0;
		while(i >= 0) {
			char curr = s.charAt(i);
			result = result + (int)Math.pow(26, t)*(curr-'A'+1);
			t++;
			i--;
		}
		return result;		
	}
	
	/*
	 *Given a positive integer, return its corresponding 
	 *column title as appear in an Excel sheet. For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB  
	 */
	//Number to Title
	
	public String convertToTitle(int n) {
		if(n <= 0) {
			throw new IllegalArgumentException("Input is not valid");
		}
		
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			n--;
			char ch = (char) (n%26 + 'A');
			n = n / 26;
			sb.append(ch);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ExcelSheetCol esc = new ExcelSheetCol();
		System.out.println(esc.titleToNumber("ABA"));
		System.out.println(esc.convertToTitle(729));
	}

}
