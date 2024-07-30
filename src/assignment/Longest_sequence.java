import java.util.*;
public class Longest_sequence {
    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        System.out.println("longest_sequence:" + findLongestSequence(nums));
    }

    public static int findLongestSequence(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums) {
            num_set.add(num);
        }
        int longestStreak = 0;


        for (int num : nums) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int current_streak = 1;


                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    current_streak += 1;
                }
                longestStreak = Math.max(longestStreak, current_streak);
            }
        }
            return longestStreak;
        }
    }

