package com.liaotao.event.observermodel;

/**
 * @Auther: liaotao
 * @Date: 2019/3/21 10:34
 * @Description:
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}
