//1. 两数之和
//https://leetcode.cn/problems/two-sum/



class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map =new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			int tmp = target-num;
			if(map.containsKey(tmp)){
				return new int[]{map.get(tmp),i};
			}else {
				map.put(num,i);
			}
		}
		return new int[]{-1,-1};
    }
}