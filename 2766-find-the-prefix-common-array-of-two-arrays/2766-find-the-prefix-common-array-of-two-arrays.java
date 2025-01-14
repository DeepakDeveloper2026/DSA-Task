class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int C[]=new int[A.length];
        
        for(int i=1;i<A.length+1;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=0;j<i;j++){
                set.add(A[j]);
            }
            int count=0;
            for(int k=0;k<i;k++){
                if(set.contains(B[k])){
                    count=count+1;
                }
            }
            C[i-1]=count;
        }
        return C;
    }
}