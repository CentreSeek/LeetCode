package array;

/**
 * 存在重复
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}