class Solution {
    public int beautySum(String s) {
        int beautydiff=0;
        int last=s.length();
        //int middle=s.length()/2;
        for(int i=0;i<last;i++){
            int freq[]=new int[26];
            for(int j=i;j<last;j++){
                freq[s.charAt(j)-'a']++;
            
            int max=0,min=Integer.MAX_VALUE;
            for(int k=0;k<26;k++){
                if(freq[k]>0){
                    max=Math.max(max,freq[k]);
                    min=Math.min(min,freq[k]);
                }
            }
            beautydiff+=(max-min);
        }
        }
        return beautydiff;
    }
}