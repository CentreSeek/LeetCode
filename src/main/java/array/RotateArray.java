package array;

import java.util.Arrays;

/**
 * 旋转数组
 */
public class RotateArray {


    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        RotateArray t = new RotateArray();
        t.rotate(nums, 3);
    }

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k + 1; i++) {
            rotateOnce(nums);
            System.out.println(Arrays.toString(nums));
        }
    }

    public int[] rotateOnce(int[] nums) {
        int agent = 0;
        int num = nums[0];
        nums[0] = nums[nums.length-1];
        for (int i = 0; i < nums.length - 1; i++) {
            agent = nums[i + 1];
            nums[i + 1] = num;
            num = agent;
        }
        return nums;
    }


}
