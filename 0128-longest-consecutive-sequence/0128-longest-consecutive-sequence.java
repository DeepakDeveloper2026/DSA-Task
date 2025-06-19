class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums.length==1) return nums.length;
        // PriorityQueue<Integer> minheap=new PriorityQueue<>();
        // for(int num:nums){
        //     minheap.offer(num);
        // }
        // int max=1;
        // int cnt=1;
        // int curr=minheap.poll();
        // while(!minheap.isEmpty()){
        //     int next=minheap.poll();
        //     if(next==curr) continue;
        //     else if(next==curr+1){
        //         cnt++;
        //         max=Math.max(max,cnt);
        //     }
        //     else cnt=1;
        //     curr=next;
        // }
        // return max;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(!set.contains(num))
            set.add(num);
        }
        int max=0;
        for(int val:set){
            if(!set.contains(val-1)){
                int currNum=val;
                int cnt=1;
            while(set.contains(currNum+1)){
                currNum++;
                cnt++;
            }
            max=Math.max(max,cnt);
            }
        }
        return max;
    }
}