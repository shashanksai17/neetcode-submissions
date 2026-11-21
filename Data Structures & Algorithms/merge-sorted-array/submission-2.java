class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        int len=m+n;
        // if(m==0){
        //    while(j<n){
        //     nums1[i++]=nums2[j++];
        //    }
        // }
        while(i<len && j<n){
            if(nums1[i]==0 && i>=m){
                nums1[i++]=nums2[j++];
            }
            else if(nums1[i]>nums2[j]){
                for(int k=len-1;k>=i;k--){
                 if(k-1>=0)   nums1[k]=nums1[k-1];
                }
                nums1[i]=nums2[j];
                j++;
                i++;
            }
            else{
                i++;
            }
        }
       
        return ;
    }
}