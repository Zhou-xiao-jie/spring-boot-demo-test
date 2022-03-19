package com.atxiaojie.demotest.springbootdemotest.test;

import java.util.concurrent.CompletableFuture;

/**
 * @ClassName: CompletableFutureDemo
 * @Description: 异步回调
 * @author: zhouxiaojie
 * @date: 2022/2/26 16:43
 * @Version: V1.0.0
 */
public class CompletableFutureDemo {

    public static void main(String[] args) throws Exception{
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "没有返回值, update mysql ok");
        });
        voidCompletableFuture.get();

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName() + "有返回值, insert mysql ok");
            int a = 10 / 0;
            return 1;
        });

        Integer integer = integerCompletableFuture.whenComplete((t, u) -> {
            System.out.println("t: " + t);
            System.out.println("u: " + u);
        }).exceptionally(f -> {
            System.out.println("exception: " + f.getMessage());
            return 444;
        }).get();
        System.out.println(integer);

    }
}
