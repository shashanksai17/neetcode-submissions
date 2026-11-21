class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        int n1=word1.length();
        int n2=word2.length();
        String res="";
        while(i<n1 && j<n2){
            res+=word1.charAt(i);
            res+=word2.charAt(j);
            i++;
            j++;
        }
        while(i<n1){
            res+=word1.charAt(i);
            i++;
        }
        while(j<n2){
              res+=word2.charAt(j);
              j++;
        }
        return res;
    }
}