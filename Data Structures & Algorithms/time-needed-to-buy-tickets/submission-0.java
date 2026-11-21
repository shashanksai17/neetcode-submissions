class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i=0;
        int ans=0;
        while(true){
            int count=0;
            for(int j=0;j<tickets.length;j++){
                if(tickets[j]==0)count++;
                else{
                    tickets[j]-=1;
                    ans++;
                    if(j==k && tickets[j]==0)return ans;
                }
            }
            if(count==tickets.length)break;
        }
        return ans;
    }
}