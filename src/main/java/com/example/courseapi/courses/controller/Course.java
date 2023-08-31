package com.example.courseapi.courses.controller;

import com.example.courseapi.topics.controller.Topic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class Course {
    @Getter
    @Id
    private String id;
    private String  name;
    private String description;



    private Topic topic;

    //This is a no arg constructor
    public Course() {

    }

    //This is a constructor that initializes the objects
    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }


}
