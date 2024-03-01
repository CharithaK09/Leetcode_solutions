class Solution {
    public String reverseVowels(String s) {
       StringBuilder sb= new StringBuilder(s);
       int left = 0, right = s.length() - 1;
       while (left < right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);
            if (isVowel(c1) && isVowel(c2)) {
                sb.setCharAt(left, c2);
                sb.setCharAt(right, c1);
                left++;
                right--;
            } else if (isVowel(c1)) {
                right--;
            } else {
                left++;
            }
       }
       return sb.toString();
    }
    
    private boolean isVowel(char c){
       return c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U';
    }

    public static void main (String[] args){
        Solution solution = new Solution();
        String s = "hello";
        System.out.println(solution.reverseVowels(s));
    }
}
