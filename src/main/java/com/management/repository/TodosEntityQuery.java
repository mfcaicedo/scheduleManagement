package com.management.repository;


import com.management.domain.entities.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosEntityQuery extends JpaRepository<ToDo, Long> {
}
