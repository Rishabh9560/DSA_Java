class Solution {
    public boolean isPalindrome(String s) {

        String valid = "";

        // Create valid string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                valid += Character.toLowerCase(ch);
            }
        }
        int i = 0 ; 
        int j = valid.length()-1 ;
        while(i <= j ){
            if(valid.charAt(i) != valid.charAt(j)){
                return false ;
            }
            i++ ;
            j-- ;
        } 
        return true ;       
    }
}