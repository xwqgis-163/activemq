package com.test.acitvemq.component;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "cid.queue")
    public void receiveMsg(String text) {
        System.out.println("receive msg: " + text);
    }
}