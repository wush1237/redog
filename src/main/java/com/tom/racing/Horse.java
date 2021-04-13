package com.tom.racing;

public class Horse extends Thread{
    @Override  //Ctrl+O
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+" " + i );
        }

    }
}
