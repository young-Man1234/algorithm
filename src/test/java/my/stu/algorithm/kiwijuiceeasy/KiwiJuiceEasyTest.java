package my.stu.algorithm.kiwijuiceeasy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KiwiJuiceEasyTest {

    @Test
    void test(){
        KiwiJuiceEasy kje = new KiwiJuiceEasy();
        int[] capacities = {14, 35, 86, 58, 25, 62};
        int[] bottles = {6, 34, 27, 38, 9, 60};
        int[] fromId = {1, 2, 4, 5, 3, 3, 1, 0};
        int[] todoId = {0, 1, 2, 4, 2, 5, 3, 1};
        int[] ints = kje.thePouring(capacities, bottles, fromId, todoId);

        System.out.println(Arrays.toString(ints));

    }



}