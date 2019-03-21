package com.liaotao.event.javaevent;

import com.liaotao.event.Person;
import com.liaotao.event.observermodel.Observer;

import java.util.*;

/**
 * @Auther: liaotao
 * @Date: 2019/3/21 13:35
 * @Description:
 */
public class Source {

    Set<MyEventListener> listeners = new HashSet<MyEventListener>();

    public void add(MyEventListener observer) {
        listeners.add(observer);
    }

    public void del(MyEventListener observer) {
        listeners.remove(observer);
    }

    public void notifyObservers() {
        for(MyEventListener listener:listeners){
            listener.handEvent(new EventObject(new Person("1","liao"+new Random().nextInt())));
        }
    }
}
