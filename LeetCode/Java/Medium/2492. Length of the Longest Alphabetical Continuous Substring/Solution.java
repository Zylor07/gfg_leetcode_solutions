class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1;
        int maxLength=1;
        for(int i=1;i<s.length();i++){
            if (s.charAt(i) == s.charAt(i - 1) + 1){
                count++;
            }
            else{
                count=1;
            }
           maxLength=Math.max(maxLength,count);
        }
        return maxLength;
    }
}