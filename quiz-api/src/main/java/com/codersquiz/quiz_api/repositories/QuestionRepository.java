package com.codersquiz.quiz_api.repositories;

import com.codersquiz.quiz_api.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface for CRUD on Question entity
public interface QuestionRepository extends JpaRepository<Question, Long> {
}