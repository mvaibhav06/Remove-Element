package leetcode;

import java.util.Arrays;

public class RemoveElement {
	
	public static int removeElement(int[] nums, int val) {
		
		int i = 0;
		int j = nums.length-1;
		
		while(i<j) {
			
			if(nums[i] == val && nums[j] != val) {
				nums[i] = nums[j];
				nums[j] = val;
				j--;
				i++;
			}else if(nums[j] == val) {
				j--;
			}else {
				i++;
			}
		}
		
		int k = 0;
		for(k=0; k<nums.length; k++) {
			if(nums[k] == val) break;
		}
		
		System.out.println(Arrays.toString(nums));
		
		return k-1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		System.out.println(removeElement(nums, 3));
	}

}
