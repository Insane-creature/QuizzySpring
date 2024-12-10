// Mapping class to Database Table

package com.quizo.quizapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data       // require to use getters and setters
@Entity     // Used to map class to DB table
public class Question {

    @Id             //annoting Id means it's a primary key
    @GeneratedValue(strategy=GenerationType.SEQUENCE)       // this indicated the values are auto generated
    private String Id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultylevel;
}
