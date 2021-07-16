package com.qigatask1.qigaTask1.Repository;

import com.qigatask1.qigaTask1.Entitiy.Posts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepo extends CrudRepository<Posts, Integer> {

    ArrayList<Posts> findAll();
    Posts findAllByPostId(String postId);
    Posts save(Posts posts);
}
