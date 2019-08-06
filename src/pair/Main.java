package pair;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,4,3,2,5,6};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindAllSumMinPairFunction solution = new FindAllSumMinPairFunction();
		
		System.out.println("Solution: " + solution.arrayPairSum(nums));
	}
}
