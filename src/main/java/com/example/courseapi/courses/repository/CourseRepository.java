package com.example.courseapi.courses.repository;

import com.example.courseapi.courses.controller.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
    /*
    getAllTopics()
    getTopic(String id)
    updateTopic(Topic t)
    deleteTopic(String id)
     */
}
