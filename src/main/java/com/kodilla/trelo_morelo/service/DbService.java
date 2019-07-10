package com.kodilla.trelo_morelo.service;

import com.kodilla.trelo_morelo.domain.Task;
import com.kodilla.trelo_morelo.mapper.TaskMapper;
import com.kodilla.trelo_morelo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {

    @Autowired
    private TaskRepository repository;

    public List<Task>  getAllTasks(){

        return repository.findAll();
    }

    public Optional<Task> getTask(final Long id){
        return repository.findById(id);
    }

    public Task getTaskById(final Long id){
        return repository.findById(id).orElse(null);
    }

    public Task saveTask(final Task task){
        return repository.save(task);
    }

    public void deleteTask(final Long id){
        repository.deleteById(id);
    }
}
