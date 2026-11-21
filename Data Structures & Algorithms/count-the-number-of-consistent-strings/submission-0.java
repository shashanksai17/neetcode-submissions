class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count=0;
        for(String i:words){
            boolean check=false;
            for(char ch:i.toCharArray()){
                if(allowed.indexOf(ch)==-1)check=true;
            }
            if(!check){
                count++;
            }
        }
return count;
    }
}