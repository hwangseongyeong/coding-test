package com.larva.coding.test.hash;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class Hash2 {

    public static void main(String[] args){
        assertEquals(true, solution(new String[]{"123", "456", "789" }));
    }

    public static boolean solution(String[] phone_book) {

        Map<String, String> hm = new HashMap<String, String>();
        for (String phone : phone_book) {
            String[] phones = phone.split("");
            String key = "";
            for(int i=0;i<phones.length-1;i++){
                key += phones[i];
                hm.put(key, phone);
            }
        }

        for(String phone : phone_book){
            if(hm.containsKey(phone)){
                return false;
            }
        }

        return true;
    }

}
