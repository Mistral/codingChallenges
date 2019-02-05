package pl.mxst4.codeWars;

import java.util.stream.IntStream;

class Sum {

    public int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }
        else if (a > b) {
            return IntStream.rangeClosed(b, a).sum();
        }
        else {
            return IntStream.rangeClosed(a, b).sum();
        }
    }

}
