package com.kodilla.trelo_morelo.mapper;

import com.kodilla.trelo_morelo.domain.Task;
import com.kodilla.trelo_morelo.domain.TaskDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TaskMapper {
    public Task mapToTask(TaskDto taskDto){
        return new Task(
                taskDto.getId(),
                taskDto.getTitle(),
                taskDto.getContent()
        );
    }

    public TaskDto mapToTaskDto(Task task)
    {
        return new TaskDto(
                task.getId(),
                task.getTitle(),
                task.getContent()
        );
    }

    public List<TaskDto> mapToTaskDtoList(List<Task> taskList){
        return taskList.stream()
                .map(t-> new TaskDto(t.getId(),t.getTitle(),t.getContent()))
                .collect(Collectors.toList());
    }
}
