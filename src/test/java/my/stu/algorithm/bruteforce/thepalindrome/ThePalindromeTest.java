package my.stu.algorithm.bruteforce.thepalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThePalindromeTest {

    @Test
    void test(){
        ThePalindrome tp = new ThePalindrome();

        int res = tp.find("abc");
        System.out.println(res);
    }

}