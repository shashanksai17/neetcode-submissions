class Solution {
    public int minimumRecolors(String blocks, int k) {
        int j=0,i=0;
        int n=blocks.length();
        int count=0;
        int min=Integer.MAX_VALUE;
        while(j<n)
        {
            char ch=blocks.charAt(j);
            if(ch=='W'){
                count++;
            }
            while(j-i+1>k){
                if(blocks.charAt(i)=='W'){
                    count--;
                }
                i++;
            }
            if(j-i+1==k){
                min=Math.min(min,count);
            }
            j++;
        }
        return min;
    }
}