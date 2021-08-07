package com.tiucompany.taskmanager.taskdetails;

import java.util.ArrayList;
import java.util.UUID;

public class TaskDetails {
    private  final UUID taskid;
    private final String type;
    private final String status;
    private final String name;
    private final String details;
    private final ArrayList<String> steps;
    public UUID getTaskid() {
        return taskid;
    }

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }



    public TaskDetails(UUID taskid,
                       String type,
                       String status,
                       String name,
                      String details,
                       ArrayList<String> steps) {
        this.taskid = taskid;
        this.type = type;
        this.status = status;
        this.name = name;
        this.details = details;
        this.steps = steps;
    }

    public String  getDetails() {
        return details;
    }
}
