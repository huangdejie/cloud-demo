package com.cashbang.eurekaserver.life;

import org.springframework.context.SmartLifecycle;

/**
 * @Author: huangdj
 * @Date: 2020/12/18
 */
public class MyLifeCycle implements SmartLifecycle {
    @Override
    public void start() {
        System.out.println("this is start() method");
    }

    @Override
    public void stop() {
        System.out.println("this is stop() method");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
