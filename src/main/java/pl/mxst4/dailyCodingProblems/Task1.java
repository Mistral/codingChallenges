package pl.mxst4.dailyCodingProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class Task1 {

    public int[] solution(int[] numbers, int k) {
        Arrays.sort(numbers);
        for (int i = 0, j = numbers.length - 1; i < j; ) {
            int sum = numbers[i] + numbers[j];
            if (sum < k) {
                i++;
            }
            else if (sum > k) {
                j--;
            }
            else {
                return new int[]{numbers[i], numbers[j]};
            }
        }
        throw new RuntimeException();
    }

    public int[] solution2(int[] numbers, int k) {
        List<Integer> nums = Arrays.stream(numbers)
                                   .boxed()
                                   .collect(Collectors.toList());

        for (int number : numbers) {
            if (nums.contains(k - number)) {
                return new int[]{number, k - number};
            }
        }
        throw new RuntimeException();
    }

}
