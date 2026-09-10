class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0 ;
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i-1] ;
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int ele = nums[i] ;
            int rem = ele-k ;
            if(ele == k ) count++ ;
            if(h.containsKey(rem)) count += h.get(rem);
            if(!h.containsKey(ele)){
                h.put(ele,1);

            }
            else{
                int freq = h.get(ele);
                h.put(ele , freq+1);
            }
            
        }
        return count ;
        
    }
}