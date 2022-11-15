

public static void quickSort(int[] nums,int left,int right) {
    if(left>=right) {
        return ;
    }
    int tmp = nums[left+right>>1];
    int i =left-1;
    int j = right+1;
    while(i<j) {
        do i++;while(nums[i]<tmp);
        do j--;while(nums[j]>tmp);
        if(i<j) {
            swap(nums,i,j);
        }
    }
    quickSort(nums,left,j);
    quickSort(nums,j+1,right);
}

public static void swap(int[] nums,int left ,int right) {
    int tmp = nums[left];
    nums[left] = nums[right];
    nums[right] = tmp;
}