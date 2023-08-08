package com.tasktracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


// Implementation of validation of data are applied  to ensure that only valid and properly
//formatted data is stored in the database.

@Entity
@Data
@Table(name="tasks")
public class Tasks {
	
	@Id
	@NotBlank
	String id;
	@NotBlank
	String title;
	@NotBlank
	String description;
	String due_date;

}
