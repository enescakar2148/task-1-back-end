package com.qigatask1.qigaTask1.Repository;

import com.qigatask1.qigaTask1.Entitiy.Stories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepo extends CrudRepository<Stories, Integer> {

    Stories save(Stories story);
    Stories findByUserId(String userId);
}
