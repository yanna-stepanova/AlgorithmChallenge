package main.catware.task_1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private static Solution solution;


    @BeforeAll
    static void beforeAll() {
        solution = new Solution();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Усі тести завершено.");
    }


    @Test
    @DisplayName("When number is 10")
    void findMultiplier_beforeTen_ok() {
        int expected = 23;
        int actual = solution.findMultiplier(10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("When number is 50")
    void findMultiplier_beforeFifty_ok() {
        int expected = 543;
        int actual = solution.findMultiplier(50);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("When number is 0")
    void findMultiplier_beforeZero_notOk() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> solution.findMultiplier(0));
    }

    @Test
    @DisplayName("When number is -16")
    void findMultiplier_beforeNegativeSixteen_notOk() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> solution.findMultiplier(-16));
    }

    @Test
    @DisplayName("When number is over the limit")
    void findMultiplier_overLimit_notOk() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> solution.findMultiplier(1000001));
    }
}
