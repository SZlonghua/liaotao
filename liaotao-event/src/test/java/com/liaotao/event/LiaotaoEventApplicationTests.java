package com.liaotao.event;

import com.liaotao.event.javaevent.OneEventListener;
import com.liaotao.event.javaevent.Source;
import com.liaotao.event.javaevent.TwoEventListener;
import com.liaotao.event.observermodel.MySubject;
import com.liaotao.event.observermodel.Observer1;
import com.liaotao.event.observermodel.Observer2;
import com.liaotao.event.observermodel.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LiaotaoEventApplicationTests {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    //观察者模式
    @Test
    public void contextLoads() {
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer1());
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

    @Test
    public void contextLoads2() {
        Source source = new Source();
        source.add(new OneEventListener());
        source.add(new OneEventListener());
        source.add(new TwoEventListener());

        source.notifyObservers();
    }

    @Test
    public void contextLoads3() {
        eventPublisher.publishEvent(new Person("1","liaotao"));
        eventPublisher.publishEvent(new Order("rrrrrrrr"));
    }

}
