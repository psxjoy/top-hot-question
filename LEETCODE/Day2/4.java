//189. 轮转数组
//https://leetcode.cn/problems/rotate-array

class Solution {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int realK = k / len == 0 ? k : k % len;
        int start = len - realK;
        int[] tmp = new int[realK];
        int[] tmp2 = new int[nums.length - realK];
        for (int i = start, j = 0; i < nums.length; i++, j++) {
            tmp[j] = nums[i];
        }
        for (int i = 0; i < nums.length - realK; i++) {
            tmp2[i] = nums[i];
        }
        for (int i = 0; i < realK; i++) {
            nums[i] = tmp[i];
        }
        for (int i = realK, j = 0; i < nums.length; i++, j++) {
            nums[i] = tmp2[j];
        }
    }
}



