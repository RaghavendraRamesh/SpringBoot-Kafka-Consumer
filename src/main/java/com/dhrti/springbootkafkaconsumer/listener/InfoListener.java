package com.dhrti.springbootkafkaconsumer.listener;

import com.dhrti.springbootkafkaconsumer.dto.CasesInfo;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class InfoListener {
    @KafkaListener(topics = "kafka_producer",groupId = "group_id")
    public void handle(String casesInfo) {
        System.out.println(casesInfo);
    }
}
