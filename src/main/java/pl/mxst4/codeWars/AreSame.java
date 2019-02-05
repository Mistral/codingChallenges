package pl.mxst4.codeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if ((a == null || b == null) || (a.length != b.length)) {
            return false;
        }

        List<Integer> aList = Arrays.stream(a)
                                    .boxed()
                                    .collect(Collectors.toList());
        List<Integer> bList = Arrays.stream(b)
                                    .boxed()
                                    .collect(Collectors.toList());

        int foundInAandB = aList.stream()
                                .map(n -> n * n)
                                .filter(n -> {
                                    if (bList.contains(n)) {
                                        bList.remove(n);
                                        return true;
                                    }
                                    return false;
                                })
                                .collect(Collectors.toList()).size();

        return foundInAandB == aList.size();
    }

}
