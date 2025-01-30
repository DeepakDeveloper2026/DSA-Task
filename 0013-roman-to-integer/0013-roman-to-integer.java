class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> romanMap=new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        int sum=0,prev=1000;
        for(int i=0;i<s.length();i++){
            int curr=romanMap.get(s.charAt(i));
            if(curr>prev){
            curr=curr-prev*2;
            sum=sum+curr;
            }
            else{
              sum=sum+curr; 
            }
            prev=curr;
        }
        return sum;
    }
}