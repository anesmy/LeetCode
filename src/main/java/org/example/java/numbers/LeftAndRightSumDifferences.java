package org.example.java.numbers;

public class LeftAndRightSumDifferences {
    public int[] leftRightDifference(int[] nums) {
        int numsLength = nums.length;
        int[] leftSum, rightSum;
        int[] answer = new int[numsLength];

        leftSum = fillLeftArray(nums);
        rightSum = fillRightArray(nums);

        for(int i = 0; i < numsLength; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return answer;
    }

    private int[] fillRightArray(int[] nums){
        int numsLength = nums.length;
        int[] rightSum = new int[numsLength];

        for(int i = 0; i < numsLength - 1; i++) {
            rightSum[i] = countRightSum(nums, i);
        }
        rightSum[numsLength - 1] = 0;
        return rightSum;
    }

    private int[] fillLeftArray(int[] nums){
        int numsLength = nums.length;
        int[] leftSum = new int[numsLength];

        leftSum[0] = 0;
        for(int i = 1; i < numsLength; i++) {
            leftSum[i] = countLeftSum(nums, i);
        }
        return leftSum;
    }

    private int countRightSum(int[] nums, int i){
        int sum = 0;
        for(int j = i + 1; j < nums.length; j++) {
            sum += nums[j];
        }
        return sum;
    }
    private int countLeftSum(int[] nums, int i){
        int sum = 0;
        for(int j = i - 1; j >= 0; j--) {
            sum += nums[j];
        }
        return sum;
    }
}
