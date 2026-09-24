package com.satyam.streams;

import java.util.List;

/**
 * map - transforms every element
 *OP - [1, 4, 9]
 */
public class MapOperation {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3);
        List<Integer> squares = numbers.stream()
                .map(n->n*n)
                .toList();

        System.out.println(squares);
    }
}
