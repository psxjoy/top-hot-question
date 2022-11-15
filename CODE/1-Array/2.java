//27. 移除元素
//https://leetcode.cn/problems/remove-element/description/


class Solution {
    public int removeElement(int[] nums, int val) {
		int slowIndex = 0;
		for(int fast=0;fast<nums.length;fast++){
			if(nums[fast]!=val){
				nums[slowIndex] = nums[fast];
				slowIndex++;
			}
		}
		return slowIndex;
    }
}