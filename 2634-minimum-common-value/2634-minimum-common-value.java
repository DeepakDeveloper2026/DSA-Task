class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int a=nums1.length,b=nums2.length;
        while(i<a && j<b){
            if(nums1[i]==nums2[j]){
                return nums1[i];
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }  
        }    
        return -1; 
    }
}