class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int left=j+1;
                int last=nums.length-1;
                while(left<last){
                long sum=(long)nums[i]+nums[j]+nums[left]+nums[last];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[last]));
                    while(left<last && nums[left]==nums[left+1]) left++;
                    while(left<last && nums[last]==nums[last-1]) last--;
                    left++;
                    last--;
                }
                else if(sum<target) left++;
                else{
                    last--;
                }
                }
            }
        }
        return result;
    }
}