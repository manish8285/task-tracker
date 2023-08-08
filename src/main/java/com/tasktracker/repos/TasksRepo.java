package com.tasktracker.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasktracker.entities.Tasks;

public interface TasksRepo extends JpaRepository<Tasks, String>{

}
