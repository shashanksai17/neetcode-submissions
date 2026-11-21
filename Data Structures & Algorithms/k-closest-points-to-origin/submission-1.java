class Solution {
    class Pair{
        double a;
        double b;
        Pair(double a,double b){
            this.a=a;
            this.b=b;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
       PriorityQueue<Pair> minHeap = new PriorityQueue<>((p, q) -> Double.compare(p.a, q.a));
        for(int i=0;i<points.length;i++){
            Pair cur=new Pair(0,0);
            cur.a=Math.pow((points[i][0]*points[i][0]+points[i][1]*points[i][1]),0.5);
            cur.b=i;
            minHeap.add(cur);
        }
        int res[][]=new int[k][2];
        int i=0;
        while(k-->0){
            Pair node=minHeap.poll();
            res[i][0]=points[(int)node.b][0];
            res[i][1]=points[(int)node.b][1];
            i+=1;
        }
        return res;


    }
}
