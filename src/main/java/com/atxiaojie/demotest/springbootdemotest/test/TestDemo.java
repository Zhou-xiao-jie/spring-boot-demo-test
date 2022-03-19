package com.atxiaojie.demotest.springbootdemotest.test;

import com.atxiaojie.demotest.springbootdemotest.pojo.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: TestDemo
 * @Description: 请按照给出数据，找出同时满足一下条件的用户，全部满足：
 * 偶数ID且
 * 年龄大于24且
 * 用户名转为大写且
 * 用户名字母倒排序，
 * 只输出一个
 * 用户名名字
 * @author: zhouxiaojie
 * @date: 2022/2/26 15:08
 * @Version: V1.0.0
 */
public class TestDemo {

    public static void main(String[] args) {
        User u1 = new User(11, "a", 23);
        User u2 = new User(12, "b", 24);
        User u3 = new User(13, "c", 22);
        User u4 = new User(14, "d", 28);
        User u5 = new User(16, "e", 26);

        List<User> list = Arrays.asList(u1, u2, u3, u4, u5);
        List<String> collect = list.stream()
                .filter(u -> {
                    return u.getId() % 2 == 0;
                })
                .filter(u -> {
                    return u.getAge() > 24;
                })
                .map(user -> {
                    return user.getUsername().toUpperCase();
                })
                .sorted((o1, o2) -> {
                    return o2.compareTo(o1);
                })
                .limit(1).collect(Collectors.toList());
        System.out.println(collect);

        int k = 7;
        int length = 7;
        System.out.println(k %= length);


    }
}
