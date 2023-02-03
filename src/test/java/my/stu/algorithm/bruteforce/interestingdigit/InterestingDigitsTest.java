package my.stu.algorithm.bruteforce.interestingdigit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InterestingDigitsTest {
    @Test
    void test(){
        InterestingDigits interestingDigits = new InterestingDigits();
        int[] digits = interestingDigits.digits(3);
        System.out.println(Arrays.toString(digits));
    }
}