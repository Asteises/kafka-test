package ru.asteises.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.consumer.model.Parameter;

@Repository
public interface ParameterStorage extends JpaRepository<Parameter, Long> {
}
