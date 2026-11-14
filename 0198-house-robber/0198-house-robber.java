class Solution {
    public int amount(int[] nums , int dp[] , int idx) {
        if(idx >= nums.length ) return 0  ;
        if(dp[idx] != -1){
            return dp[idx] ; 
        } 
        int take = nums[idx] + amount(nums , dp , idx+2) ; 
        int skip = amount(nums , dp , idx+1) ; 
        return dp[idx] = Math.max(take , skip ) ;  
        
    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length] ; 
        Arrays.fill(dp , -1) ; 
        return amount(nums , dp , 0 ) ; 
        
    }
}