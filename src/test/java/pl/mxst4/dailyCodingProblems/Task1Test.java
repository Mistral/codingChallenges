package pl.mxst4.dailyCodingProblems;

import org.junit.Before;
import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class Task1Test {

    private int[] numbers = {25, 4, 9, 10, 54, 69, 125, 55, 1, 0, 4, 8, 9, 43, 23};

    private Task1 task;

    @Before
    public void setup() {
        task = new Task1();
    }

    @Test
    public void solution2() {
        int[] result = task.solution2(numbers, 44);
        assertEquals(44, IntStream.of(result).sum());
    }

    @Test
    public void solution() {
        int[] result = task.solution(numbers, 44);
        assertEquals(44, IntStream.of(result).sum());
    }

}