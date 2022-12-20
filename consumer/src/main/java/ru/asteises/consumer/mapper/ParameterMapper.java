package ru.asteises.consumer.mapper;

import org.springframework.stereotype.Service;
import ru.asteises.consumer.model.Parameter;
import ru.asteises.consumer.model.dto.ParameterDto;

@Service
public class ParameterMapper {

    public static Parameter toParameter(ParameterDto parameterDto) {

        Parameter parameter = new Parameter();
        parameter.setName(parameterDto.getName());
        parameter.setValue(parameterDto.getValue());

        return parameter;
    }
}
