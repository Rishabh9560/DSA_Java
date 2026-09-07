class Solution {
    public class Pair implements Comparable<Pair>{
        int ele ;
        int freq ; 
        Pair(int ele  , int freq){
            this.ele = ele  ;
            this.freq = freq ;
        }
        public int compareTo(Pair p){
            return this.freq-p.freq ;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> h = new HashMap<>() ;
        for(int ele : nums){
            if(!h.containsKey(ele)){
                h.put(ele , 1) ;
            }else{
                int freq = h.get(ele) ;
                h.put(ele , freq+1) ;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>() ;
        for(int ele : h.keySet()){
            int freq = h.get(ele);
            pq.add(new Pair(ele,freq)) ;
            if(pq.size() > k){
                pq.remove() ;
            }
        }
       int ans[]= new int[k] ;
       for(int i = 0 ; i < k ; i++){
        Pair p = pq.remove() ;
        ans[i] = p.ele ;
       }
       return ans ;
        
    }
}