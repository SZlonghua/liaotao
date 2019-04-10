package com.liaotao.event;

import java.util.concurrent.atomic.AtomicInteger;

public class A {
    private static int i=0;
    public static void main(String[] args){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("one:"+i++);
            }
        });
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(i++);
            }
        });
        t.start();
        /*try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Thread.State state = t.getState();
        System.out.println("sss:"+state);
        t1.start();
    }
}
