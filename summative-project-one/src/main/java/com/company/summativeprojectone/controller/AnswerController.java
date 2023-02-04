package com.company.summativeprojectone.controller;

import com.company.summativeprojectone.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {
    private static List<Answer> answerList = new ArrayList<>(Arrays.asList(
            new Answer(0, "Will I find true love?", "No"),
            new Answer(1, "Will I become rich", "No"),
            new Answer(2, "Will I live a short life", "It is certain"),
            new Answer(3, "Will AI take over the world", "It is certain"),
            new Answer(4, "May there be a way of stopping climate change", "No"),
            new Answer(5, "Will Twitter go bankrupt", "It is certain")
    ));

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer askQuestion(@RequestBody Answer question) {
        Random rand = new Random();
        return answerList.get(rand.nextInt(answerList.size()));
    }
}
