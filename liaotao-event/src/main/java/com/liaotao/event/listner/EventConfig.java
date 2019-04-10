package com.liaotao.event.listner;

import com.liaotao.event.Order;
import com.liaotao.event.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Auther: liaotao
 * @Date: 2019/3/21 16:04
 * @Description:
 */
@Component
@Slf4j
public class EventConfig {

    @EventListener(value = Person.class)
    public void handEvent(Person person){
        log.info("QQQQQQQQQQQQQQQQQQQ");
        System.out.println(Thread.currentThread().getId()+":"+person.toString());
    }


    @EventListener(value = Person.class)
    public void handEvent1(Person person){
        System.out.println("1:"+Thread.currentThread().getId()+":"+person.toString());
    }

    @EventListener(value = Order.class)
    public void handEvent2(Order order){
        System.out.println("2:"+order);
    }


}
