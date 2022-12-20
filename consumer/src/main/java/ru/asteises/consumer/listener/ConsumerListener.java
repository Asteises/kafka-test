package ru.asteises.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@EnableKafka
public class ConsumerListener {

    @KafkaListener(topics = "message")
    public void messageListener(String message) {

        System.out.println("Получаем из kafka в listener: " + message);

        log.info("Получаем лог из kafka в listener: {}", message);
    }
}
