//217. 存在重复元素
//https://leetcode.cn/problems/contains-duplicate/



class Solution {
    public boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++){
			if(!set.add(nums[i]) {
				return true;
			}
		}
		return false;
    }
}