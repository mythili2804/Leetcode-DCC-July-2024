class Solution {
    public String reverseParentheses(String s) {
         StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        int i = 0;

        // Iterate through the string
        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                int start = st.pop(); // Get the matching '(' index
                String tempo = new StringBuilder(sb.substring(start + 1, i)).reverse().toString();
                sb.replace(start + 1, i, tempo);
            }
            i++;
        }

        // Remove all parentheses from the final string
        StringBuilder res = new StringBuilder();
        for (i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '(' && sb.charAt(i) != ')') {
                res.append(sb.charAt(i));
            }
        }

        return res.toString();
    }
} 