package com.quizo.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizo.quizapp.Question;

// all the fetching
@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
    
}
