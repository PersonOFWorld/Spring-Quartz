package com.with0.QuartzExaple;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by One on 2016/8/4.
 */
public class MainApp {
    public static void main(String[] args){
        new ClassPathXmlApplicationContext("spring-beans.xml");
    }
}
