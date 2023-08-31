package com.example.courseapi.repository;

import com.example.courseapi.controller.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
    /*
    getAllTopics()
    getTopic(String id)
    updateTopic(Topic t)
    deleteTopic(String id)
     */
}
