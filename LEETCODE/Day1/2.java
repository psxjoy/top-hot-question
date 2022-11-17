//53. 最大子数组和
//https://leetcode.cn/problems/maximum-subarray/

 
class Solution {
    public int maxSubArray(int[] nums) {
		int ans = nums[0];
        int sum = 0;
        for(int num: nums) {
            if(sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}