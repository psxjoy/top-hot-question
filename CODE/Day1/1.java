//https://leetcode.cn/problems/binary-search/
//704.二分查找
class Solution {
    public int search(int[] nums, int target) {
		int left =0;
		int right = nums.length-1;
		while(left<=right) {
			int mid = left+right>>1;
			if(nums[mid]>target) {
				right = mid-1;
			}else if(nums[mid]<target) {
				left = mid+1;
			}else {
				return mid;
			}
		}
		return mid;
    }
}
class Solution1 {
    public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		while(left<right) {
			int mid = left+right>>1;
			if(nums[mid]>target ){
				right = mid;
			}else  if(nums[mid]<target) {
				left = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
   }
}