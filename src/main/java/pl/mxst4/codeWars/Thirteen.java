package pl.mxst4.codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Thirteen {

    private static List<Integer> dividers = Arrays.asList(1, 10, 9, 12, 3, 4);

    public static long thirt(long n) {
        long lastResult;
        do {
            lastResult = n;
            n = divide(lastResult);
        } while (n != lastResult);
        return n;
    }

    private static long divide(long n) {
        List<Character> digits = String.valueOf(n).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        Collections.reverse(digits);
        List<Integer> sum = new ArrayList<>();
        int i = 0;
        for (Character character : digits) {
            if (i == dividers.size()) {
                i = 0;
            }
            sum.add(Character.getNumericValue(character) * dividers.get(i));
            i++;
        }
        return sum.stream().mapToInt(Integer::valueOf).sum();
    }

}
