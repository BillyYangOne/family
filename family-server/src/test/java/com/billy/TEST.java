package com.billy;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试类
 */
public class TEST {

    public static void main(String[] args) {

        new TEST().testMap();
    }

    private void testMap() {

        Map<String, String> map = new HashMap<>();
        map.put("item1", "value1,value2");
        map.put("item2", "v1,v2");
        map.put("item3", "value");
        map.put("item4", "");


        map.forEach((key, value) -> {

            String[] values = value.split("[,]");
            for (String v : values) {
                System.out.println("key:" + key + " value:" + v);
            }

        });

    }

}
