package ru.asteises.consumer.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.asteises.consumer.mapper.ContainerMapper;
import ru.asteises.consumer.mapper.ParameterMapper;
import ru.asteises.consumer.model.Container;
import ru.asteises.consumer.model.Parameter;
import ru.asteises.consumer.model.dto.ContainerValue;
import ru.asteises.consumer.model.dto.ParameterDto;
import ru.asteises.consumer.repository.ContainerStorage;
import ru.asteises.consumer.repository.ParameterStorage;

@Slf4j
@RequiredArgsConstructor
@Service
public class ConsumerServiceImpl implements ConsumerService {

    private final ContainerStorage containerStorage;
    private final ParameterStorage parameterStorage;

    @Override
    public void saveContainer(ContainerValue containerValue) {

        Container container = ContainerMapper.toContainer(containerValue);

        containerStorage.save(container);
        log.info("Сохранили в БД container: {}", container);
    }

    @Override
    public void saveParameter(ParameterDto parameterDto) {

        Parameter parameter = ParameterMapper.toParameter(parameterDto);

        parameterStorage.save(parameter);
        log.info("Сохранили в БД parameter: {}", parameter);
    }
}
