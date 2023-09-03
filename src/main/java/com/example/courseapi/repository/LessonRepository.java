package com.example.courseapi.repository;

import com.example.courseapi.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonRepository extends JpaRepository<Lesson, String> {
    public List<Lesson> findByLessonId(String lessonId);
}