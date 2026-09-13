class Solution {
    public int longestOnes(int[] arr , int k) {
        int i = 0, j = 0;
        int len = 0, noFlip = 0;
        int maxLen = 0;
        int n = arr.length;

        while (j < n) {

            if (arr[j] == 0) {
                noFlip++;
            }

            while (noFlip > k) {

                if (arr[i] == 0) {
                    noFlip--;
                }

                i++;
            }

            len = j - i + 1;
            maxLen = Math.max(maxLen, len);

            j++;
        }

        return maxLen;
    }
}