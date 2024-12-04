
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        int takeNum = nums.length/2;
        Set<Integer> monTypes = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return Math.min(takeNum, monTypes.size());

    }
}