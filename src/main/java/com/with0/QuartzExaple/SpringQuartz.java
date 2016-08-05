package com.with0.QuartzExaple;

import java.util.Date;

/**
 * Created by One on 2016/8/4.
 */
public class SpringQuartz {
    private static int count = 1;
    public void execute(){
        long ms = System.currentTimeMillis();
        System.out.println("第"+count+"次任务触发 ："+new Date(ms));
        count++;
    }
}
