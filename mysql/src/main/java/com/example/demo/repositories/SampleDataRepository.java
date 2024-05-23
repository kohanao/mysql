package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.SampleData;

public interface SampleDataRepository
		extends JpaRepository<SampleData, Integer> {

}
