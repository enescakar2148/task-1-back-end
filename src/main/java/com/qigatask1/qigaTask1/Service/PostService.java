package com.qigatask1.qigaTask1.Service;

import com.qigatask1.qigaTask1.Entitiy.Posts;
import com.qigatask1.qigaTask1.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public ArrayList<Posts> getAllPost() {
        return postRepo.findAll();
    }

    public Posts getPost(String postId) {
       return postRepo.findAllByPostId(postId);
    }

    public Posts newPost(Posts post) {
        return postRepo.save(post);
    }
}
