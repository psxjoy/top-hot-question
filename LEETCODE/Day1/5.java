//278. 第一个错误的版本
//https://leetcode.cn/problems/first-bad-version/



/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
		int left = 0;
		int mid=0;
		int right = n;
		while(left<=right){
			mid = left+(right-left)/2;
			boolean check = isBadVersion(mid);
			if(check) {
				right = mid-1;
			}else {
				left = mid+1;
			}
		}
		return left;
	}
}
