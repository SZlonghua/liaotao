package com.liaotao.event;

import com.liaotao.event.javaevent.OneEventListener;
import com.liaotao.event.javaevent.Source;
import com.liaotao.event.javaevent.TwoEventListener;
import com.liaotao.event.observermodel2.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@Slf4j
public class LiaotaoEventApplicationTests {

    //Log logger = LogFactory.getLog(LiaotaoEventApplicationTests.class);

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    //观察者模式
    @Test
    public void test() {
        log.info("aaaaaaaa");
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());

        sub.operation();
    }

    //观察者模式
    @Test
    public void contextLoads() {
        //logger.info("ddddddddddddddd");
        log.info("sssssssssss");
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
        try {
            eventPublisher.publishEvent(new Person("1","liaotao"));
        }catch (IllegalArgumentException e){
            System.out.println("捕获到异常："+e.getStackTrace());
        }

        //eventPublisher.publishEvent(new Order("rrrrrrrr"));
    }

}
