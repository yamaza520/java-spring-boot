package com.example.entity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface TaskRepository extends Repository<Task, String> {

    Page<Task> findAll(Pageable pageable);

}
