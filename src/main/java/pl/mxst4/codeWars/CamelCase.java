package pl.mxst4.codeWars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class CamelCase {

    static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        String modifedWords = Stream.of(Arrays.copyOfRange(words, 1, words.length))
                                    .map(word -> word.substring(0, 1)
                                                     .toUpperCase()
                                                     .concat(word.substring(1)))
                                    .collect(Collectors.joining());
        return words[0].concat(modifedWords);
    }

}
