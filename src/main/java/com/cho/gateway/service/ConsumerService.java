package com.cho.gateway.service;

import com.cho.gateway.message.ConsumerChannel;
import com.cho.gateway.message.Greeting;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {


    @StreamListener(ConsumerChannel.CHANNEL)
    public void consume(Greeting greeting) {
        System.out.println(greeting.getMessage());
    }
}
