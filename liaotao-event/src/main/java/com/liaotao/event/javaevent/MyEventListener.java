package com.liaotao.event.javaevent;

import java.util.EventListener;
import java.util.EventObject;

public interface MyEventListener extends EventListener {

    void handEvent(EventObject event);
}
