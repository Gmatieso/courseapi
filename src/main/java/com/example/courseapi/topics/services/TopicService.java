package com.example.courseapi.topics.services;

import com.example.courseapi.topics.controller.Topic;
import com.example.courseapi.topics.repository.TopicRepository;
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

    public  List<Topic> getAllTopics() {
        //creating a list
        List<Topic> topic = new ArrayList<>();
        topicRepository.findAll().forEach(topic::add);
        return topic;
    }

    //get a topic
    public Topic getTopic(String id){

          Optional<Topic> optionalTopic = topicRepository.findById(id);
          //Check if optional topic contains a value, and return it if present
        if (optionalTopic.isPresent()){
            return optionalTopic.get();
        } else {
            //Handle the case where the topic with the given ID was not found
            //here we could throw an exceptional or return null
            return null;
        }

    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    /*
    Loop through every topic depending on the size of the topic
    for each topic in the list compare with the id, if its matches
    update it
     */
    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(Topic id) {
         topicRepository.delete(id);
    }
}
