package my.stu.algorithm.bruteforce.cryptography;

import my.stu.algorithm.bruteforce.cryptography.Cryptography;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CryptographyTest {


    @Test
    void test(){
        Cryptography cryptography = new Cryptography();
        int[] arr = new int[]{1000, 999, 998, 997, 996, 995};
        long encrypt = cryptography.encrypt(arr);
        long encrypt2 = cryptography.ImprovedEncrypt(arr);
        System.out.println(encrypt);
        System.out.println(encrypt2);
        Assertions.assertThat(encrypt).isEqualTo(encrypt2);
    }
}