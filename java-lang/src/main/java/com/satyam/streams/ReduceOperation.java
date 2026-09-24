package com.satyam.streams;

import java.util.List;

/**
 * reduce - combines many elements into one result
 *
 *OP - 10
 *
 * For [1,2,3,4]
 * conceptually:
 * 0 + 1
 *   ↓
 * 1 + 2
 *   ↓
 * 3 + 3
 *   ↓
 * 6 + 4
 *   ↓
 * 10
 */
public class ReduceOperation {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        int sum = numbers.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
