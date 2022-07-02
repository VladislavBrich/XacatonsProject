package com.example.demo.repositories;

import com.example.xacton_trying_2.Models.AnswerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepo extends JpaRepository<AnswerModel, Long> {
    List<AnswerModel> findAllByName(String name);
}
