package com.satyam.optional;

import java.util.List;
import java.util.Optional;

//Output - 100 found
public class OptionalApi {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,100,101);

        Optional<Integer> num = numbers.stream()
                .filter(n->n>10)
                .findFirst();

        num.ifPresentOrElse(
                (n)->System.out.println(n+" found"),
                ()->System.out.println("bye"));
    }
}
