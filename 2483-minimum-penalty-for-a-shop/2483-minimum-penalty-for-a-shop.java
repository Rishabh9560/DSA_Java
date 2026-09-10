class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length() ;
        int prefixNo[] = new int[n+1] ;
        for(int i = 1 ; i < prefixNo.length ; i++){
            prefixNo[i] = prefixNo[i-1] ;
            if(customers.charAt(i-1) == 'N') prefixNo[i]+=1 ; 

        }
        int suffixYes[] = new int[n+1] ;
        for(int i = n-1 ; i >= 0 ; i--){
            suffixYes[i] = suffixYes[i+1] ;
            if(customers.charAt(i)=='Y') suffixYes[i]+=1 ; 

        }
        int ans[] = new int[n+1] ;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = prefixNo[i] + suffixYes[i] ;
            min = Math.min(min , ans[i]);

        }
        for(int i = 0 ; i < ans.length ; i++){
            if(ans[i] == min) return i; 
        }
        return 6564949 ;
        
    }
}