class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count[]=new int[2];
        for(int i:students){
            count[i]+=1;
        }
        int res=students.length;
        for(int i:sandwiches){
            if(count[i]>0){
                res--;
                count[i]-=1;
            }
            else{
                break;
            }
        }
        return res;
    }
}