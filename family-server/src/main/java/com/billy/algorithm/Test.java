package com.billy.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * 测试类
 * 1、stream Api  内部迭代
 */
public class Test {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        Map<String, List<User>> collect = users.stream()
                .filter((User u) -> u.getAge() > 10) //筛选
                .collect(groupingBy(User::getSex));  //分组

        System.out.println(collect.get("123"));

        List<User> collect1 = users.parallelStream().filter((User u) -> "male".equals(u.getSex()))
                .collect(toList());



    }
}
