class Solution {
    public class Pair implements Comparable<Pair>{
        int ele ; 
        int diff ;
        Pair(int ele , int diff){
            this.ele = ele ; 
            this.diff = diff ;
        }
        public int compareTo(Pair p){
            if(this.diff == p.diff){
                return this.ele-p.ele ;
            }
            return this.diff - p.diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder()) ;
        for(int i = 0 ; i < arr.length ; i++){
            int diff = Math.abs(x-arr[i]) ;
            pq.add(new Pair(arr[i] , diff)) ;
            if(pq.size() > k ){
                pq.remove();
            }
        }
        List<Integer> arrr = new ArrayList<>() ;
        while(pq.size() > 0){
            Pair p = pq.remove() ;
            arrr.add(p.ele) ;

        }
        Collections.sort(arrr);
        return arrr ;
        
    }
}