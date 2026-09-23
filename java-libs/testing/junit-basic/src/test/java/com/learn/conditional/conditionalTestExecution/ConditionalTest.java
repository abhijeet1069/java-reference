package com.learn.conditional.conditionalTestExecution;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

// Skipping test, Current hour = 9 , Try post 20
public class ConditionalTest {

    @Test
    @ExtendWith(NightOnlyCondition.class)
    void testRunsOnlyAtNight() {
        System.out.println("Running at night!");

    }
}