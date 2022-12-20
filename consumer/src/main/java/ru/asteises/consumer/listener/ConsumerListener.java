package ru.asteises.consumer.listener;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.asteises.consumer.model.dto.ContainerValue;
import ru.asteises.consumer.service.ConsumerService;

@Slf4j
@RequiredArgsConstructor
@Component
@EnableKafka
public class ConsumerListener {

    private final ConsumerService consumerService;

    @KafkaListener(topics = "message")
    public void messageListener(ConsumerRecord<String, ContainerValue> record) {

        System.out.println("Получаем из kafka в listener: " + record);

        consumerService.saveContainer(record.value());
        log.info("Получаем лог из kafka в listener: {}", record);

    }
}
