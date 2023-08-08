package com.tasktracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tasktracker.entities.Tasks;
import com.tasktracker.services.TasksService;

import jakarta.validation.Valid;

@RestController
public class TaskController {
	
	@Autowired
	private TasksService taskService;

	@GetMapping("/")
	public String test() {
		return "hello from other side";
	}
	
	
	
	//POST /tasks: Create a new task.
	
	@PostMapping("/tasks")
	public ResponseEntity<Tasks> createTask(@RequestBody @Valid Tasks task){
		Tasks task2 = this.taskService.createTask(task);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(task2);
	}
	
	//GET /tasks/{id}: Retrieve a task by its ID.
	@GetMapping("/tasks/{id}")
	public ResponseEntity<Tasks> getTaskById(@PathVariable String id){
		Tasks task = this.taskService.getTask(id);
		return ResponseEntity.status(HttpStatus.OK).body(task);
	}
	
	
	//GET /tasks: Retrieve a list of all tasks.
	@GetMapping("/tasks")
	public ResponseEntity<List<Tasks>> getALlTasks(){
	
		return ResponseEntity.status(HttpStatus.OK).body(this.taskService.getAllTasks());
	}
	
	
	//PUT /tasks/{id}: Update an existing task by its ID.
	@PutMapping("/tasks/{id}")
	public ResponseEntity<Tasks> updateTask(@PathVariable("id") String id,  @RequestBody @Valid Tasks task){
		Tasks task2 = this.taskService.updateTask(task, id);
		
		return ResponseEntity.status(HttpStatus.OK).body(task2);
	}
	
	//DELETE /tasks/{id}: Delete a task by its ID.
	@DeleteMapping("/tasks/{id}")
	public ResponseEntity<String> deleteTask(@PathVariable("id") String id){
		this.taskService.deleteTask(id);
		
		return ResponseEntity.status(HttpStatus.OK).body("Task Deleted Successfully");
	}
	
	
	
}
