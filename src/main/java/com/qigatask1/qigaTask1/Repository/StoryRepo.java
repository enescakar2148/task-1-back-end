package com.qigatask1.qigaTask1.Repository;

import com.qigatask1.qigaTask1.Entitiy.Stories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StoryRepo extends CrudRepository<Stories, Integer> {

    Stories save(Stories story);
    Stories findByStoryId(int storyId);
    ArrayList<Stories> findAll();
    //boolean remove(int storyId);
}
