package com.motionlab.datastructures.dynamicarray.arrays;

/**
 * @author Abu Bizibu
 * @created
 * @project
 */
public class MinimumPrefixSum {


    private static int minStartValue(int[] nums)
    {

        // Store the minimum prefix sum
        int minValue = 0;

        // Stores prefix sum at each index
        int sum = 0;

        // Traverse over the array
        for(int n : nums)
        {

            // Update the prefix sum
            sum += n;

            // Update the minValue
            minValue = Math.min(minValue, sum);
        }

        int startValue = 1 - minValue;

        // Return the positive start value
        return startValue;
    }

    public static void main(String[] args)
    {
        int[] nums = { -3, 2, -3, 4, 2 };

        // Function Call
        System.out.println(minStartValue(nums));
    }

    public int minStartValue02(int[] nums) {

        int minValue = 0;
        int sum = 0;

        for (int i = 1; i < nums.length; i++) {
            nums[i] =  nums[i - 1] + nums[i];
            minValue = Math.min(minValue, nums[i - 1]);
        }
        minValue = Math.min(minValue, nums[nums.length - 1]);
        int startValue = 1 - minValue;
        return startValue;

    }

}
