/*Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].
*/
public class ProductOfArrayExceptSelf {
	//O(n) space taken
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int[] t1 = new int[nums.length];
		int[] t2 = new int[nums.length];
		
		t1[0] = 1;
		t2[nums.length - 1] = 1;
		
		//Scan from left to right
		for(int i=0; i<nums.length; i++) {
			t1[i+1] = t1[i] * nums[i];
		}
		
		//Scan right to left'
		for(int i =nums.length-1; i>0; i--) {
			t2[i-1] = t2[i] * nums[i];
		}
		
		//Multiply both
		for(int i=0; i<nums.length; i++) {
			result[i] = t1[i] * t2[i];
		}
		
		return result;
	}
	
	//O(1) space
	public int[] productESelf(int[] nums) {
		int[] result = new int[nums.length];
		result[nums.length - 1] = 1;
		
		for(int i = nums.length-2; i>=0; i--) {
			result[i] = result[i+1]*nums[i+1];
		}
		
		int left = 1;
		for(int i=0; i<nums.length; i++) {
			result[i] = result[i]*left;
			left = left*nums[i];
		}
		return result;
	}
	
 	public static void main(String[] args) {
		
	}

}
