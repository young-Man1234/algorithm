package my.stu.algorithm.bruteforce.cryptography;

import java.util.Arrays;

public class Cryptography {


    /*
        문제: int[]을 입력받는다. 입력 받은 List에서 하나의 숫자를 뽑아 +1 한다. 이때 리스트 ㅐ부의 모든 숫자 곱이 가장 커져야 한다.

        제약조건: numbers 2~50개의 요소가 있는 배열이며 각 요소의 값은 1~1000이다
        리턴값 2^62 넘지 않는다

     */

    public long encrypt(int[] numbers){
        long result = 0;
        for(int i = 0; i < numbers.length; i++){
            long temp = 1;
            for(int j = 0; j < numbers.length; j++){

                if(i == j)
                    temp *= (numbers[j] + 1);
                else
                    temp *= numbers[j];
            }
            result = Math.max(result, temp);
        }
        return result;
    }

    //배열에서 가장 작은 값을 +1 해주고 배열의 값을 곱해주면 해결된다.
    public long ImprovedEncrypt(int[] numbers){
        long result = 1;
        Arrays.sort(numbers);
        numbers[0]++;
        for(int i = 0; i < numbers.length; i++){
            result *= numbers[i];
        }
        return result;
    }




}
