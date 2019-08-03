package array;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
class SolutionE {
    public void moveZeroes(int[] nums) {
        int arg = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arg += 1;
                continue;
            }
            nums[i - arg] = nums[i];
        }
        for (int i = nums.length - 1; i > nums.length - arg - 1; i--) {
            nums[i] = 0;
        }
    }
}