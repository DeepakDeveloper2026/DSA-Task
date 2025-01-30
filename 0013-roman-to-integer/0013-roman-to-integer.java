class Solution {
    public int romanToInt(String s) {
        String[] romanArr={"I","V","X","L","C","D","M"};
        int[]  numArr={1,5,10,50,100,500,1000};
        int sum=0,curr=0,prev=1000;
        for(int j=0;j<s.length();j++){
            for(int i=0;i<romanArr.length;i++){
                if(String.valueOf(s.charAt(j)).equals(romanArr[i])){
                    curr=numArr[i];
                   if(curr>prev){
                    curr=curr-prev*2;
                    sum=sum+curr;
                    
                   }
                   else{
                      sum=sum+curr;
                      
                   }
                   prev=curr;
                }
            }

        }
        return sum;
    }
}