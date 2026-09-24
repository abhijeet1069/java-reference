package com.satyam.streams;

import java.util.List;

/**
 * filter - keep elements satisfying a condition
 *OP - [2, 4, 6]
 */
public class FilterOperation
{
    public static void main( String[] args )
    {
        List<Integer> numbers = List.of(1,2,3,4,5,6);

        List<Integer> even = numbers.stream()
                .filter(n->n%2 == 0)
                .toList();

        System.out.println(even);
    }
}
