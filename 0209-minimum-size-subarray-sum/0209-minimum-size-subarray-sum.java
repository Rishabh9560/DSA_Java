class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0 , j = 0 ;
        int n = nums.length , minLength = Integer.MAX_VALUE  , sum = 0 ; 
        while(j < n && sum < target){
            sum += nums[j++] ;
        } 
        j-- ; 
        while(i < n && j < n){
            int len = j-i+1 ;
            if(sum >= target) minLength = Math.min(len , minLength) ;
            sum -= nums[i] ;
            i++ ;
            j++;
            while(j < n && sum < target){
                sum += nums[j++] ;

            }
            j-- ; 

        }
        if(minLength == Integer.MAX_VALUE) return 0 ;
        return minLength ;

    }
}