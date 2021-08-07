package com.tiucompany.taskmanager.taskdetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("task")
public class TaskController {
    @GetMapping
    public List<TaskDetails> getAllTasks(){
        ArrayList<String> sl=new ArrayList<>();
        sl.add("Step1: Research");
        sl.add("Step2: Learn");
        sl.add("Step3: Implement");

        return List.of(new TaskDetails(UUID.randomUUID(),"HOME","TO DO","Suyash Srivastava","Complete Fullstack development: project 1",sl),
                new TaskDetails(UUID.randomUUID(),"Office","Completed","Suyash Srivastava","Push the changes to git",sl));
    }
}
