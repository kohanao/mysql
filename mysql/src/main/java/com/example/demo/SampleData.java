package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todolist")
public class SampleData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(length = 100, nullable = false)
	private String type;

	@Column(length = 255, nullable = true)
	private String task;

	@Column(length = 50, nullable = true)
	private String preference;

	public String getName() {
		return type;
	}

	public void setName(String name) {
		this.type = name;
	}

	public String getPrice() {
		return task;
	}

	public void setPrice(String price) {
		this.task = price;
	}

	public String getStock() {
		return preference;
	}

	public void setStock(String stock) {
		this.preference = stock;
	}

}
