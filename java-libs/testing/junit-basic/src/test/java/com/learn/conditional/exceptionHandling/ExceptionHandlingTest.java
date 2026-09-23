package com.learn.conditional.exceptionHandling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

public class ExceptionHandlingTest {

    @Test
    @ExtendWith(IgnoreIllegalArgument.class)
    void testException(){
        throw new IllegalArgumentException("Invalid input");
    }
}
