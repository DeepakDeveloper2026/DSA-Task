class Solution {
    public int maxFrequencyElements(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        // System.out.print(map);
        int max=0;
        for(int freq : map.values()){
            max=Math.max(max,freq);
        }
        for(int occurMaxFre:map.values()){
            if(occurMaxFre==max){
                count+=occurMaxFre;
            }
        }
        return count;
    }
}