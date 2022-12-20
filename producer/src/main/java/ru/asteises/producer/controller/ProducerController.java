package ru.asteises.producer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.asteises.producer.dto.ContainerValue;
import ru.asteises.producer.service.ProducerService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/message")
public class ProducerController {

    private final ProducerService producerService;


    @PostMapping
    public void sendMessage(@RequestParam String topic,
                            @RequestBody ContainerValue containerValue) {

        producerService.sendMessage(topic, containerValue);
        System.out.println("Отправляем из контроллера в сервис: " + containerValue);

        log.info("Отправляем лог из контроллера в сервис: {}", containerValue);
    }
}
