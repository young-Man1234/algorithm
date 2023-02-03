package my.stu.algorithm.bruteforce.kiwijuiceeasy;

public class KiwiJuiceEasy {

    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] todoId){

        for(int i = 0; i < fromId.length; i++){
            if(bottles[fromId[i]] + bottles[todoId[i]] > capacities[todoId[i]]){
                bottles[fromId[i]] = (bottles[fromId[i]] + bottles[todoId[i]]) - capacities[todoId[i]];
                bottles[todoId[i]] = capacities[todoId[i]];
            }
            else{
                bottles[todoId[i]] = bottles[fromId[i]] + bottles[todoId[i]];
                bottles[fromId[i]] = 0;
            }
        }
        return bottles;
    }
}
