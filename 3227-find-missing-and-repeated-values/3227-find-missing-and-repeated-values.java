class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> ls =new ArrayList<>();
        int size=0;
        HashSet<Integer> set=new HashSet<>();
        for(int[] arr:grid){
            for(int num:arr){
                if(!set.contains(num)){
                    set.add(num);
                    size++;
                }
                else{
                    ls.add(num);
                    size++;
                }
            }
        }
        for(int i=1;i<=size;i++){
            if(set.contains(i)) continue;
            else ls.add(i);
        }
        // System.out.print(size);
        return ls.stream().mapToInt(Integer::intValue).toArray();
    }
}