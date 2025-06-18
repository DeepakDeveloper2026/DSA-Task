class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num : nums){
            if(num>0) pos.add(num);
            else neg.add(num);
        }
        int arr[]=new int[nums.length];
        int p=0,n=0,i=0;
        while(i<nums.length){
            if(i%2==0) arr[i]=pos.get(p++);
            else arr[i]=neg.get(n++);
            i++;
        }
        return arr;
    }
}