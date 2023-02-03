package my.stu.algorithm.bruteforce.interestingparty;

import java.util.HashMap;
import java.util.Map;

public class InterestingParty {



    /*
        문제

        화이트씨는 인싸다
        하지만 그의 친구들은 아싸라서 2가지 주제에만 관심이 있으며 다른 관심사에는 관심이 없다
        화이트씨는 모두가 즐겁게 보낼수 있는 파티를 개최하려고 하는데 아싸인 친구들이 문제다
        그래서 어떤 친구들을 불러야 모두가 즐거운 파티가 될지 고민이다
        그 동안의 경험으로 초대된 친구 모두가 공통의 관심사가 있을 때 파티를 즐긴다는것을 알았다

        문자열 배열 first, second가 주어진다. 화이트씨의 i번째 친구가 흥미 있는 화제는 first[i]와 second[i]
        즐거운 파티가 되려면 화이트씨가 초대할 수 있는 친구는 최대 몇 명인지 리턴하시오

     */
    public int bestInvitation(String[] first, String[] second){
        int result = 0;

        for(int i = 0; i < first.length; i++){
            int f = 0;
            int s = 0;

            for(int j = 0; j < first.length; j++){
                if(first[i].equals(first[j])) f++;
                if(first[i].equals(second[j])) f++;
                if(second[i].equals(second[j])) s++;
                if(second[i].equals(first[j])) s++;
            }

            result = Math.max(f, result);
            result = Math.max(s, result);

        }


        return result;
    }

    public int useMapBestInvitation(String[] first, String[] second){
        int result = 0;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < first.length; i++){
            map.put(first[i], 0);
            map.put(second[i], 0);
        }

        for(int j = 0; j < first.length; j++){
            map.put(first[j], map.get(first[j])+1);
            map.put(second[j], map.get(second[j])+1);
        }

        for(String key : map.keySet()){
            result = Math.max(result, map.get(key));
        }

        return result;
    }

}
