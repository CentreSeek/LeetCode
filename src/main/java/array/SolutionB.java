package array;

/**
 * 只出现一次的数字
 */
class SolutionB {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]&&i!=j){
                    break;
                }
                if(j == nums.length-1&&nums[i]!=nums[j]&&i!=j){
                    return nums[i];
                }
            }
            if(i == nums.length - 1){
                return nums[i];
            }
        }
        return 0;
    }
}