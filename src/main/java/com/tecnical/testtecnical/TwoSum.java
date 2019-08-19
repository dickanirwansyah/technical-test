package com.tecnical.testtecnical;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args){
        int[] numbers = new int[]{ -2, 3, 7, 4, 8 };
        int target = 11;
        int[] result = getTwoSum(numbers, target);
        System.out.println("index ke "+result[0] + " dan "+" index ke " +result[1]);
    }

    static int[] getTwoSum(int[] numers, int target){
        Map<Integer, Integer> visitedNumber = new HashMap<>();
        for (int i=0; i < numers.length; i++){
            int delta = target - numers[i];
            if (visitedNumber.containsKey(delta)){
                return new int[]{i, visitedNumber.get(delta)};
            }
            visitedNumber.put(numers[i], i);
        }
        return new int[]{-1, -1};
    }
}
