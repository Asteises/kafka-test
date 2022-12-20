package ru.asteises.consumer.mapper;

import org.springframework.stereotype.Service;
import ru.asteises.consumer.model.Container;
import ru.asteises.consumer.model.dto.ContainerValue;

@Service
public class ContainerMapper {

    public static Container toContainer(ContainerValue containerValue) {
//        Container newContainer = new Container.ContainerBuilder()
//                .id(containerValue.getId())
//                .time(containerValue.getTime())
//                .build();
        Container newContainer = new Container();
        newContainer.setId(containerValue.getId());
        newContainer.setTime(containerValue.getTime());

        return newContainer;
    }
}
