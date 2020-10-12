package com.larva.coding.test.hash;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class Hash3 {

    public static void main(String[] args){

        assertEquals(5, solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        assertEquals(3, solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}}));
        assertEquals(3, solution(new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
    }

    public static int solution(String[][] clothes) {

        int answer = 1;

        Map<String, Integer> hm = new HashMap<>();

        for(int i=0;i<clothes.length;i++){
            for(int j=0;j<clothes[i].length;j++){
                if(j==1){
                    hm.put(clothes[i][j], hm.getOrDefault(clothes[i][j], 0) + 1);
                }
            }
        }

        for(int value : hm.values()){
            answer *= (value + 1);
        }

        return answer -1;
    }

}
