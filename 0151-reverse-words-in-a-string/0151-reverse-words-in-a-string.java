class Solution {
    public String reverseWords(String s) {
    StringBuilder str = new StringBuilder();
    String[] stArr=s.split("\\s+");
    for(int i=stArr.length-1;i>=0;i--){
        str.append(stArr[i]).append(' ');
    }
    return str.toString().trim();
    }
}
