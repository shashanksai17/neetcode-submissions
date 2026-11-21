class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String i:details){
        //System.out.println(Integer.parseInt(i.substring(12,14)));
            if(Integer.parseInt(i.substring(11,13))>60){
                count++;
            }
        }
        return count;
    }
}