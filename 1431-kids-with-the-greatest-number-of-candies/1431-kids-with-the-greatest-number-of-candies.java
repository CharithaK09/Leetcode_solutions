import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        
        
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        
        
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 3;
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }
}
