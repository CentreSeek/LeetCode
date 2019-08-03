package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两个数组的交集2
 */
public class SolutionC {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !map.containsKey(i) && !map.containsValue(j)) {
                    map.put(i, j);
                    break;
                }
            }
        }
        System.out.println(map.toString());
        int[] arr = new int[map.size()];
        int i = 0;
        for (Integer key :
                map.keySet()) {
            arr[i] = nums1[key];
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        SolutionC solution = new SolutionC();
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        System.out.println(Arrays.toString(solution.intersect(a,b)));
    }
}
