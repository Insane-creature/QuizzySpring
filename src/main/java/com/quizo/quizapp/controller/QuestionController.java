package com.quizo.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // as to accept the request,  whatever the question request will come this will handle
@RequestMapping("question") // question is the path.

public class QuestionController {
    @GetMapping("allQuestions")
    public String getAllQuestions(){
        return "Hi, these are your questions!";
    }
    
}
