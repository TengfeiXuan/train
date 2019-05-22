package com.test.train.leetCode;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: xuantf
 * @version: 1.0.0
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoNumSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 3, 67, 1};
        int[] result = search(nums, 6);
        System.out.println(Arrays.toString(result));
    }

    private static int[] search(int[] nums, int target) {
        int[] result = new int[2];
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            map.put(target - nums[i], i);
        }
        return result;
    }
}
