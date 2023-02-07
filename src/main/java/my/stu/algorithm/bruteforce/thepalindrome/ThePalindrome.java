package my.stu.algorithm.bruteforce.thepalindrome;

public class ThePalindrome {

    /*
        회문
        예) abc 회문으로 가장 짧은 회문의 길이를 구하시오 ans: 5 (abcba)

     */
    public int find(String s){
        for(int i = s.length(); ; i++){
            boolean flag = true;
            for(int j = 0; j < s.length(); j++){
                if((i - j - 1) < s.length() && s.charAt(j) != s.charAt(i - j - 1)){
                    flag = false;
                    break;
                }
            }

            if(flag) return i;
        }
    }

}
