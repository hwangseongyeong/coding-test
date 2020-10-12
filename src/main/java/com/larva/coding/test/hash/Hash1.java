package com.larva.coding.test.hash;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class Hash1 {

    public static void main(String[] args){
        assertEquals("kiki", solution(new String[]{"kiki", "eden", "kiki" }, new String[]{"eden", "kiki" }));
    }

    public static String solution(String[] participant, String[] completion) {

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for(i=0;i<completion.length;i++){

            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[i];
    }

}
