package com.worker.demo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author 郝少杰
 * @date 2021/1/7 3:32
 */
public class SayHello {

    @Value("${name}")
    private static  String name;

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("测试");
        System.out.println(name);
    }


}
