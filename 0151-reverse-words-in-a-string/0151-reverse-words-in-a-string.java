public class Solution {
    public String reverseWords(String s) {
     s = s.trim();
     String[] words = s.split("\\s+");
        
     reverseArray(words);
        
     return String.join(" ", words);
    }
    
    
    private void reverseArray(String[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "  the sky is   blue  ";
        System.out.println(solution.reverseWords(s)); // Output: "blue is sky the"
    }
}
