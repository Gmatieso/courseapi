package com.example.courseapi.services;

import com.example.courseapi.controller.Course;
import com.example.courseapi.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    //Get TopicRepository instance into topic service
    @Autowired
    private TopicRepository topicRepository;

    //create a method that returns a list of topics

    public  List<Course> getAllCourse() {
        //creating a list
        List<Course> courses = new ArrayList<>();
        topicRepository.findAll().forEach(courses::add);
        return courses;
    }

    //get a topic
    public Course getCourse(String id){

          Optional<Course> optionalTopic = topicRepository.findById(id);
          //Check if optional topic contains a value, and return it if present
        if (optionalTopic.isPresent()){
            return optionalTopic.get();
        } else {
            //Handle the case where the topic with the given ID was not found
            //here we could throw an exceptional or return null
            return null;
        }

    }

    public void addCourse(Course course) {
        topicRepository.save(course);
    }

    /*
    Loop through every topic depending on the size of the topic
    for each topic in the list compare with the id, if its matches
    update it
     */
    public void updateCourse(String id, Course course) {
        topicRepository.save(course);
    }

    public void deleteCourse(Course id) {
         topicRepository.delete(id);
    }
}
