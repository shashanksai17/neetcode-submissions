class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
                List<Integer>temp=new ArrayList<>();
           for(int j=0;j<=i;j++){
              if(j==0 || j==i){
                temp.add(1);
              }
              else{
                temp.add(res.get(res.size()-1).get(j)+res.get(res.size()-1).get(j-1));
              }
           }
           res.add(new ArrayList<>(temp));
        }
        return res;
    }
}