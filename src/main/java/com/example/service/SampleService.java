package com.example.service;

import com.example.entity.Task;
import com.example.entity.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    TaskRepository taskRepository;

    public int calcNum(int a, int b) {
        return a + b;
    }

    public Page<Task> getTaskAll() {
        return taskRepository.findAll(new PageRequest(0, 1));
    }

}
