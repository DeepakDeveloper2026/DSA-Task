class Solution {
    public void sortColors(int[] nums) {
    PriorityQueue<Integer> minheap=new PriorityQueue<>();
    for(int num:nums){
        minheap.offer(num);
    }
    int i=0;
    while(!minheap.isEmpty()){
        nums[i]=minheap.poll();
        i++;
    }
    }
}