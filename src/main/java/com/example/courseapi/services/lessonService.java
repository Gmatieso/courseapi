package com.example.courseapi.services;

import com.example.courseapi.model.Lesson;
import com.example.courseapi.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class lessonService {

    //Get LessonRepository instance into lesson service
    @Autowired
    private LessonRepository lessonRepository;

    //get all lesson that belongs to a topic

    List<Lesson>  getAllLessons(String topicId) {
        //Creating a list of Lesson store them in an array
        List<Lesson> lessons = new ArrayList<>();
        /*TODO findByLessonId*/
        return null;
    }

    //get a lesson id associated with a topic id
    public Lesson getLesson(String id){
        Optional<Lesson> optionalLesson = lessonRepository.findById(id);
        //Check if optional lesson contains a value and return it if present
        if(optionalLesson.isPresent()){
            return  optionalLesson.get();
        }else {
            //Handle the case where the lesson with the given ID was not found
            // here we could throw and exceptional or return null
            return  null;
        }
    }

    public void addLesson(Lesson lesson){
        lessonRepository.save(lesson);
    }

    public void  updateLesson(Lesson lesson){
        lessonRepository.save(lesson);
    }

    public  void deleteLesson(Lesson id){
        lessonRepository.delete(id);
    }

}
