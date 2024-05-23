package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todolist")
@Data
@NoArgsConstructor
public class SampleData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	public SampleData(String type, String task, int preference) {
		super();
		this.type = type;
		this.task = task;
		this.preference = preference;
	}

	private String type;

	private String task;

	private int preference;

	//ゲッターとセッター
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getPreference() {
		return preference;
	}

	public void setPreference(int preference) {
		this.preference = preference;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
