package ru.asteises.producer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import ru.asteises.producer.dto.ContainerValue;

@Slf4j
@Service
public class ProducerService {

    private final KafkaTemplate<String, ContainerValue> kafkaTemplate;

    @Autowired
    public ProducerService(KafkaTemplate<String, ContainerValue> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String topic, ContainerValue containerValue) {

        kafkaTemplate.send(topic, containerValue);

        log.info("Отправляем лог из сервиса в kafka: {}", containerValue);
    }

}
