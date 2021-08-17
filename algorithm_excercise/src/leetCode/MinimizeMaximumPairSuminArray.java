package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimizeMaximumPairSuminArray {

	public static void main(String[] args) {

		int[] nums = {4,1,5,1,2,5,1,5,5,4};
		
//		List<Integer> maxList = new ArrayList<>();
		
		Arrays.sort(nums);
		
		int sum =0;
		int max = 0;
		
		for(int i =0;i<(nums.length)/2;i++) {
			
			sum = nums[i]+nums[nums.length-1-i];
			System.out.println(sum);
			if(max<sum) {
				max = sum;
			}
//			maxList.add(sum);
		}
		System.out.println("max"+max);
		
//		System.out.println(maxList);
//		System.out.println(Collections.max(maxList));
		
		// Collection 쓰기보다 대소비교가 더 빠르다!!
		
	}

}
