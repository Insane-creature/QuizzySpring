package com.quizo.quizapp.controller;


import com.quizo.quizapp.service.QuestionService;
import com.quizo.quizapp.Question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // as to accept the request,  whatever the question request will come this will handle
@RequestMapping("question") // question is the path.

public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }
    
}
