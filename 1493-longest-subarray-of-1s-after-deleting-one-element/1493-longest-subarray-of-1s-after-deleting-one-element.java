class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length , zeroes = 0  ;
        int i = 0 , j = 0 , maxLen = 0 , len = 0 ; 
        int z = 0  ;
        for(int ele : nums){
            if(ele == 0) z++; 
        }
        if(z == 0) return n-1 ;// i am removing a '1'
        
        while(i < n && nums[i] == 0){  // move i to first  '1'
            i++ ;

        }
        if(i == n ) return 0 ; // all element are '0'
        j = i ;
        while(j < n){
            if(nums[j] == 1) j++ ;
            else{ //arr[j] == 0
                if(zeroes == 0){
                    j++ ;
                    zeroes++ ;
                }
                else{
                    len = j-i-1 ;
                    maxLen = Math.max(maxLen , len) ;
                    j++ ;
                    while(i < n && nums[i] == 1) i++ ;
                    i++ ;
                }
            }
        }
        if(zeroes == 0 ) return j-i ;
        len = j-i-1 ;
        maxLen = Math.max(maxLen , len) ;
        return maxLen ;
        
    }
}