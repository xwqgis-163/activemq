package com.test.acitvemq.component;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.jms.Queue;

@RestController
public class Producer {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private Queue queue;

    @GetMapping("/send")
    public void sendMsg(String msg) {
        System.out.println("send msg :" + msg);
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }
}