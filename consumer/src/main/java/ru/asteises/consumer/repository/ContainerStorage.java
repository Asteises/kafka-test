package ru.asteises.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.asteises.consumer.model.Container;

@Repository
public interface ContainerStorage extends JpaRepository<Container, Long> {
}
