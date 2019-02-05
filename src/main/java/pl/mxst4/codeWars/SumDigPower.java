package pl.mxst4.codeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {
        return LongStream.rangeClosed(a, b)
                         .filter(number -> {
                             long temporaryNumber = number;
                             List<Integer> digits = new ArrayList<>();
                             do {
                                 digits.add((int) temporaryNumber % 10);
                                 temporaryNumber /= 10;
                             } while (temporaryNumber > 0);

                             Collections.reverse(digits);
                             List<Long> powList = new ArrayList<>();
                             for (int i = 0; i < digits.size(); i++) {
                                 powList.add((long) Math.pow(digits.get(i), i + 1));
                             }
                             return number == powList.stream()
                                                     .reduce(Long::sum)
                                                     .get();
                         })
                         .boxed()
                         .collect(Collectors.toList());
    }

}
