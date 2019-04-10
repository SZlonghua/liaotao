package com.liaotao.event;

import com.liaotao.event.javaevent.OneEventListener;
import com.liaotao.event.javaevent.Source;
import com.liaotao.event.javaevent.TwoEventListener;
import com.liaotao.event.observermodel.MySubject;
import com.liaotao.event.observermodel.Observer1;
import com.liaotao.event.observermodel.Observer2;
import com.liaotao.event.observermodel.Subject;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LiaotaoEventApplicationTests {

    //Log logger = LogFactory.getLog(LiaotaoEventApplicationTests.class);

    @Autowired
    private ApplicationEventPublisher eventPublisher;

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
        eventPublisher.publishEvent(new Person("1","liaotao"));
        eventPublisher.publishEvent(new Order("rrrrrrrr"));
    }

}
