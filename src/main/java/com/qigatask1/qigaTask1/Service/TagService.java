package com.qigatask1.qigaTask1.Service;

import com.qigatask1.qigaTask1.Entitiy.Tags;
import com.qigatask1.qigaTask1.Entitiy.Users;
import com.qigatask1.qigaTask1.Repository.TagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagRepo tagRepo;

    public List<Tags> getAllTagsUser(){
        return tagRepo.findAll();
    }

    public Tags getTagUser(String userId){
        return tagRepo.getByUserId(userId);
    }

    public Tags addUserToTags(Tags user){
        return tagRepo.save(user);
    }
}
