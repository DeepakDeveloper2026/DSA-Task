class Solution {
    public String removeOuterParentheses(String s) {
        // Stack<Character> st = new Stack<>();
        // int open=1;
        // int close=0;
        // int start = 0;
        // for (int i = 1; i < s.length(); i++) {
        //     char c = s.charAt(i);
        //     if (c == '(') {
        //         open++;
        //     } else {
        //         close++;
        //     }
        //     st.push(c);
        //     if(close==open){
        //         st.pop();
        //         close=0;
        //         open=1;
        //         i++;
        //     }
        //     }
        //     String d="";
        // while(!st.isEmpty()) {
        // 	d=st.pop()+d;
            
        // }
        // return d;
        StringBuilder str=new StringBuilder();
        List<String> ls=new ArrayList<>();
        int start=0,balance=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')
            balance++;
            if(c==')')
            balance--;
            str.append(c);
            if(balance==0){
            ls.add(str.toString());
            str.setLength(0);
            }
        }
        String st="";
        for (int i = 0; i < ls.size(); i++) {
            st += ls.get(i).substring(1, ls.get(i).length() - 1);
        }
        return st;
    }
}