
public class PowerSet {
	public void printPowerSet(char[] set, int setSize) {
		int powerSetSize = (int) Math.pow(2, setSize);
		int counter;
		for(counter = 0; counter < powerSetSize; counter++) {
			for(int j=0; j<setSize; j++) {
				if((counter & (1 << j)) != 0) {
					System.out.print(set[j]);
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		char[] set = {'a', 'b', 'c'};
		int setSize = set.length;
		System.out.println("[]"); //Empty
		PowerSet ps = new PowerSet();
		ps.printPowerSet(set, setSize);
	}

}
