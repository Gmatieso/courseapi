package com.example.courseapi.controller;

import com.example.courseapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired  //declares this as a dependency
    private CourseService courseService;
    @RequestMapping("/topics/{id}/courses")
//    getAllTopics to retun list of topics objects done
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses();
    }

    //returns one topic
    @RequestMapping("/topics/{topicId}/courses/{Id}")
    public Course getCourse(@PathVariable  String id){
        return  courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses/{Id}")
    public  void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id){
        courseService.updateCourse(id, course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable Course id) {
        courseService.deleteCourse(id);
    }


}

