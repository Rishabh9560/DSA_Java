class Solution {
    public int totalFruit(int[] arr) {
        int i = 0 , j = 0 , n = arr.length , maxLen = 0 ;

        HashMap<Integer , Integer> map = new HashMap<>() ;
        while(j < n){
            if(map.containsKey(arr[j])){
                int freq = map.get(arr[j]) ;
                map.put(arr[j] , freq+1) ;

            }
            else{
                map.put(arr[j] , 1) ;
            }
            while(map.size() > 2){
            int freq = map.get(arr[i]) ;
            if(freq == 1) map.remove(arr[i]) ;
            else map.put(arr[i] , freq-1) ;
            i++ ;
        }

        int len = j-i+1;
        maxLen = Math.max(maxLen , len) ;
        j++ ; 
        }
        return maxLen ;
        
        
    }
    
}