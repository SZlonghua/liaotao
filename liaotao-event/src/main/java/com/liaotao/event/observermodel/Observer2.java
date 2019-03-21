package com.liaotao.event.observermodel;

/**
 * @Auther: liaotao
 * @Date: 2019/3/21 10:29
 * @Description:
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
