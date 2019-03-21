package com.liaotao.event.javaevent;

import java.util.EventObject;

/**
 * @Auther: liaotao
 * @Date: 2019/3/21 13:44
 * @Description:
 */
public class OneEventListener implements MyEventListener {
    @Override
    public void handEvent(EventObject event) {
        System.out.println("OneEventListener:"+event.getSource());
    }
}
