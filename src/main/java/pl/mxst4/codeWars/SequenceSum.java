package pl.mxst4.codeWars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceSum {

    public static String showSequence(int value) {
        if (value < 0) {
            return String.valueOf(value).concat("<0");
        }
        else if (value == 0) {
            return "0=0";
        }
        else {
            int sum = IntStream.rangeClosed(0, value).sum();
            return IntStream.rangeClosed(0, value).mapToObj(String::valueOf).collect(Collectors.joining("+")).concat(" = ").concat(String.valueOf(sum));
        }
    }

}
