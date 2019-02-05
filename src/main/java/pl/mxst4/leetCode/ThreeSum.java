package pl.mxst4.leetCode;

import java.util.*;

class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k] == 0)
                            && (i != j)
                            && (i != k)
                            && (j != k)) {
                        List<Integer> result = Arrays.asList(nums[i], nums[j], nums[k]);
                        result.sort(Comparator.naturalOrder());
                        results.add(result);
                    }
                }
            }
        }
        return new ArrayList<>(results);
    }

}
