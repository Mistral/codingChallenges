package pl.mxst4.codeWars;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
 * <p>
 * "(p1**n1)(p2**n2)...(pk**nk)"
 * with the p(i) in increasing order and n(i) empty if n(i) is 1.
 * <p>
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */

public class PrimeDecomp {

    public static String factors(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        do {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    if (isPrime(i)) {
                        primeFactors.add(i);
                        n /= i;
                        break;
                    }
                }
            }
        } while (n > 1);

        List<PrimeFactor> factors = new ArrayList<>();

        int lastFactor = 0, factorIndex = -1;
        for (Integer primeFactor : primeFactors) {
            if (lastFactor == primeFactor) {
                factors.get(factorIndex).incrementMultiply();
            }
            else {
                factors.add(new PrimeFactor(primeFactor));
                lastFactor = primeFactor;
                factorIndex++;
            }
        }

        StringBuilder output = new StringBuilder();

        factors.forEach(factor -> {
            if (factor.getMultiply().equals(1)) {
                output.append("(" + factor.getFactor() + ")");
            }
            else {
                output.append("(" + factor.getFactor() + "**" + factor.getMultiply() + ")");
            }
        });

        return output.toString();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n % 2 == 0) {
            return true;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

class PrimeFactor {

    private Integer factor;

    private Integer multiply = 1;

    PrimeFactor(Integer factor) {
        this.factor = factor;
    }

    void incrementMultiply() {
        multiply++;
    }

    Integer getFactor() {
        return factor;
    }

    Integer getMultiply() {
        return multiply;
    }

}