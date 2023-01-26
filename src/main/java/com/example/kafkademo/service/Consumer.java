package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "test-events", groupId = "test-group-id")
    public void listenToMsg(String receivedMessage){
        System.out.println("Message received: "+ receivedMessage);
    }
}
