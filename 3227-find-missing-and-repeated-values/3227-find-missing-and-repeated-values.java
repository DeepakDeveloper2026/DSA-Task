class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int[2];
        int size=0;
        HashSet<Integer> set=new HashSet<>();
        for(int[] arr2:grid){
            for(int num:arr2){
                if(!set.contains(num)){
                    set.add(num);
                    size++;
                }
                else{
                    arr[0]=num;
                    size++;
                }
            }
        }
        for(int i=1;i<=size;i++){
            if(set.contains(i)) continue;
            else arr[1]=i;
        }
        return arr;
    }
}