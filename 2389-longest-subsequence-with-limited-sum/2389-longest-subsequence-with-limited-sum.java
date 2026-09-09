class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums) ;
        int n= nums.length ;
        for(int i = 1 ; i < n  ; i++){
            nums[i] = nums[i] + nums[i-1] ;
        }
        int m = queries.length ;
        int ans[] = new int[m] ;
        for(int i = 0 ; i < m ; i++){
        int l = 0 ; 
        int r = n-1 ;
        while(l <= r){
            int mid = l + (r-l)/2 ;
            if(nums[mid] > queries[i]) r = mid-1 ;
            else{ 
                ans[i] = Math.max(ans[i] , mid+1) ;
                l = mid+1 ;
            }
        }
        }
        return ans ; 
        
    }
}