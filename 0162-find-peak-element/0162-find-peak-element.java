class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length ;
        int st = 0 ; 
        int ed = n-1 ; 
       

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if ((mid == 0 || nums[mid] > nums[mid - 1]) &&
                (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            }
            else if (mid < n - 1 && nums[mid] < nums[mid + 1]) {
                st = mid + 1;
            }
            else {
                ed = mid - 1;
            }
        }

        return -1;

        
    }
}