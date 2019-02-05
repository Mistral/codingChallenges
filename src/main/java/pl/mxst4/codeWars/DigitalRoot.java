package pl.mxst4.codeWars;

import java.util.ArrayList;
import java.util.List;

class DigitalRoot {

    public static int digital_root(int n) {
        do {
            n = sumOfDigits(n);
        }
        while (n > 9);
        return n;
    }

    private static Integer sumOfDigits(int n) {
        List<Integer> digits = new ArrayList<>();
        while (n > 0) {
            digits.add(n % 10);
            n /= 10;
        }
        return digits.stream().mapToInt(digit -> digit).sum();
    }

}
