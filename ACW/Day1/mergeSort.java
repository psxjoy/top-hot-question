
public static void mergeSort(int[] nums,int left ,int right) {
    if(left>=right) {
        return ;
    }
    int mid = left+right>>1;
    mergeSort(nums,left,mid);
    mergeSort(nums,mid+1,right);
    int k =0;
    int i = 0;
    int j = mid+1;
    int[] tmp = new int[right-left+1];
    while(i<=mid && j<=right) {
        if(nums[i]<nums[j]) {
            tmp[k++] =nums[i++];
        }else {
            tmp[k++] = nums[j++];
        }
    }
    while(i<=mid) {
        tmp[k++] = nums[i++];
    }
    while(j<=right) {
        tmp[k++] = nums[j++] ;
    }
    for(i = left,j=0;i<=right;i++,j++) {
        nums[i] = tmp[j];
    }
}