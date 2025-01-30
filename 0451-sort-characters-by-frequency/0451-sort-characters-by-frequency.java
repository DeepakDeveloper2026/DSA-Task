class Solution {
    public String frequencySort(String s) {
       int n=s.length();
       int [] freq=new int[128];
       char[] ch=s.toCharArray();
       char result[]=new char[n];
       for(char chr:ch){
        freq[chr]++;
       }
       int i =0;
       while(i<n){
        int max=0;
        int idx=0;
        for(int j=0;j<128;j++){
            if(max<freq[j]){
                max=freq[j];
                idx=j;
            }
        }
        while(freq[idx]>0){
            result[i++]=(char)idx;
            freq[idx]--;

        }

       }
       return new String(result);

    }
}