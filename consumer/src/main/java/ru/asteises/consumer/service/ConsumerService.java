package ru.asteises.consumer.service;

import org.springframework.stereotype.Service;
import ru.asteises.consumer.model.dto.ContainerValue;
import ru.asteises.consumer.model.dto.ParameterDto;

@Service
public interface ConsumerService {

    void saveContainer(ContainerValue containerValue);

    void saveParameter(ParameterDto parameterDto);
}
