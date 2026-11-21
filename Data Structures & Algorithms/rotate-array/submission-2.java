class Solution {
    public void find(int arr[],int i,int j){
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        find(arr,n-k,n-1);
        find(arr,0,n-k-1);
        find(arr,0,n-1);
        return;
    }
}