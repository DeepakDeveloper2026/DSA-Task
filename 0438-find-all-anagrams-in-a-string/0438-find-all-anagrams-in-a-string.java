class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();
        int l1=s.length();
        int l2=p.length();
        System.out.print(l2);
        int pFreq[]=new int[26];
        for(char c:p.toCharArray()) pFreq[c-'a']++;
        for(int i=0;i<l1;i++){
            if(i+l2<=l1){
            String substr=s.substring(i,i+l2);
            boolean present=check(substr,pFreq);
            if(present) ls.add(i);
            }
        }
        return ls;
    }
    public boolean check(String substr,int[] pFreq){
        int sFreq[]=new int[26];
        for(char c:substr.toCharArray()) sFreq[c-'a']++;
        return Arrays.equals(pFreq,sFreq);
    }
}