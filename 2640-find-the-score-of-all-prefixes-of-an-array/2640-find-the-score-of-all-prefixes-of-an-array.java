class Solution {
    // for(int i = 0 ; i < )
    public long[] findPrefixScore(int[] nums) {
        
        int n= nums.length ;  
        long arr[] = new long[n] ;
        int max = 0 ;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max, nums[i]);
            arr[i] = nums[i] + max  ;
            
        }
        for(int i = 1 ; i < n ; i++){
            arr[i] += arr[i-1] ;
        }
        return arr ;

        
    }
}