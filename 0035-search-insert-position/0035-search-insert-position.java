class Solution {
    public int searchInsert(int[] nums, int target) {
          int n = nums.length ;
        int st = 0 ;
        int ed = n-1 ;
        
        while(st <= ed){
            int mid  = st+(ed-st)/2;
        if(nums[mid] == target){
            return mid ;
        }
        if(nums[mid] < target){
            st = mid+1;
        }
        else{       
            ed = mid-1;
        }
        }
        return st;
        
    }
}