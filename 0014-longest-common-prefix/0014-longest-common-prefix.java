class Solution {
    public String longestCommonPrefix(String[] strs) {
    String prefix=strs[0];
    StringBuilder str=new StringBuilder();
    for(int i=0;i<prefix.length();i++){
        char chcurr=prefix.charAt(i);
        Boolean iscommon=true;
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length() || strs[j].charAt(i)!=chcurr){
            iscommon=false;
            break;
            }
        }
        if(iscommon)
        str.append(chcurr);
        else
        break;
    }
    return str.toString();
}
}