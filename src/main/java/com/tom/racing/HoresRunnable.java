package com.tom.racing;

public class HoresRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("RR" + i);
        }
    }
}
