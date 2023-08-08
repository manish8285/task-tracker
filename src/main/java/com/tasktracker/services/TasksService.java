package com.tasktracker.services;

import java.util.List;

import com.tasktracker.entities.Tasks;


public interface TasksService {

	Tasks getTask(String id);
	
	Tasks updateTask(Tasks task, String id);
	
	void deleteTask(String id);
	
	Tasks createTask(Tasks task);
	
	
	List<Tasks> getAllTasks();
	
}
