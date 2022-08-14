class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(target == nums[mid]){
                return mid;
            } else if(target < nums[mid]){
                high = mid-1;
            } else if(target > nums[mid]){
                low = mid+1;
            }
        }
        if(target < nums[mid]){
            return mid;
        } else {
            return mid+1;
        }
    }
}