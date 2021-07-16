package com.qigatask1.qigaTask1.Service;

import com.qigatask1.qigaTask1.Entitiy.Stories;

import com.qigatask1.qigaTask1.Repository.StoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoryService {

    @Autowired
    private StoryRepo storyRepo;

    public Stories uploadStory(Stories story){
        return storyRepo.save(story);
    }

    public Stories displayStoriesForUser(String storyId){
        return storyRepo.findByStoryId(storyId);
    }
    public ArrayList<Stories> getAllStories(){
        return storyRepo.findAll();
    }
}
