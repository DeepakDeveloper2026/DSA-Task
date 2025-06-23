class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls=new ArrayList<>();
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n=nums.length;
        for(int val:map.keySet()){
            if(map.get(val)>n/3){
                ls.add(val);
            }
        }
        return ls;
    }
}