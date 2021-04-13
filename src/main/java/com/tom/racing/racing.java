package com.tom.racing;

public class racing {
    public static void main(String[] args) {
        Hores h1 = new Hores();
        Hores h2 = new Hores();
        HoresRunnable h3 = new HoresRunnable();
        Thread th = new Thread(h3);
        th.start();
        h1.start();
        h2.start();
    }
}
