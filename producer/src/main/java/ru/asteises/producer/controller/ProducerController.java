package ru.asteises.producer.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.asteises.producer.service.ProducerService;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/message")
public class ProducerController {

    private final ProducerService producerService;


    @PostMapping
    public void sendMessage(String messageId, String message) {

        producerService.sendMessage(messageId, message);
        System.out.println("Отправляем из контроллера в сервис: " + message);

        log.info("Отправляем лог из контроллера в сервис: {}", message);
    }
}
