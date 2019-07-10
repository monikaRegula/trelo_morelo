package com.kodilla.trelo_morelo.repository;

import com.kodilla.trelo_morelo.domain.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task,Long> {
    @Override
    List<Task> findAll();

    @Override
    Task save(Task task);

    @Override
    Optional<Task> findById(Long id);
}
