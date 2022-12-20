package ru.asteises.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.asteises.consumer.model.dto.ContainerValue;

@Slf4j
@Component
@EnableKafka
public class ConsumerListener {

    @KafkaListener(topics = "message")
    public void messageListener(ConsumerRecord<String, ContainerValue> record) {

        System.out.println("Получаем из kafka в listener: " + record);

        log.info("Получаем лог из kafka в listener: {}", record);
    }
}
