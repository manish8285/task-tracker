package com.tasktracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tasktracker.entities.Tasks;
import com.tasktracker.repos.TasksRepo;

@Service
public class TasksServiceImple implements TasksService {
	
	@Autowired
	private TasksRepo tasksRepo;

	@Override
	public Tasks getTask(String id) {
		// TODO Auto-generated method stub
		return this.tasksRepo.findById(id).orElseThrow(()->new RuntimeException("Task not found"));
	}

	@Override
	public Tasks updateTask(Tasks task, String id) {
		// TODO Auto-generated method stub
		Tasks task2 =this.getTask(id);
		task2.setDescription(task.getDescription());
		task2.setTitle(task.getTitle());
		task2.setDue_date(task.getDue_date());
		return this.tasksRepo.save(task2);
	}

	@Override
	public void deleteTask(String id) {
		Tasks task2 =this.getTask(id);
		this.tasksRepo.delete(task2);
		
	}

	@Override
	public Tasks createTask(Tasks task) {
		// TODO Auto-generated method stub
		return this.tasksRepo.save(task);
	}

	@Override
	public List<Tasks> getAllTasks() {
		// TODO Auto-generated method stub
		return this.tasksRepo.findAll();
	}

}
