//88. 合并两个有序数组
//https://leetcode.cn/problems/merge-sorted-array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
		int len = m+n-1;
		while(m>0 && n>0){
			if(nums1[m-1]>nums2[n-1]){
				nums1[len--] = nums1[m-1];
				m--;
			}else {
				nums1[len--] = nums2[n-1];
				n--;
			}
		}
		for(int i=0;i<n;i++) {
			nums1[i] = nums2[i];
		}
    }
}