package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entities.Student;

public interface Repository  extends JpaRepository<Student, Integer>{

}
