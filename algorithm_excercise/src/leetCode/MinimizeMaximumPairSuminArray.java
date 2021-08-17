package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimizeMaximumPairSuminArray {

	public static void main(String[] args) {

		int[] nums = {3,2,4,1,1,5,1,3,5,1};
		
		List<Integer> maxList = new ArrayList<>();
		
		for(int i =0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i] == nums[j]) {
					maxList.add(nums[i]*2);
					nums[i] = 0;
					nums[j] = 0;
				}
			}
		}
		
		for(int i =0;i<nums.length-1;i++) {
			for(int j=i+1;j<nums.length;j++) {
				
				if(nums[i] !=0) {
					int a = nums[i];System.out.println("a"+a);
					if(nums[j] !=0) {
						maxList.add(a+nums[j]);
						i=i+2;
						j=j+1;
						System.out.println("j"+j);
						System.out.println("이거"+nums[j]);
					}else if(nums[nums.length-1] !=0){
						j++;
						maxList.add(a+nums[j]);
					}
					else {}
					System.out.println(maxList);
				}else {
					if(i+1<nums.length) {
						i=i+1;
					}
				}
			}
			
		}
		for(int i =0;i<nums.length;i++) {
			System.out.print(nums[i]+" ,");
		}
		System.out.println(maxList);
		System.out.println(Collections.max(maxList));
		
	}

}
