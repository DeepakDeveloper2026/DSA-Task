class Solution {
    public int[][] divideArray(int[] nums, int k) {
        List<int[]> result=new ArrayList<>();
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=3){
            int subarr[] = {nums[i], nums[i + 1], nums[i + 2]};
            if(subarr[2] - subarr[0] > k){
                return new int[0][0];
            }
            result.add(subarr);
        }
        return result.toArray(new int[result.size()][]);
    }
}