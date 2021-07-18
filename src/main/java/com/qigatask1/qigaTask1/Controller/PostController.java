package com.qigatask1.qigaTask1.Controller;

import com.qigatask1.qigaTask1.Entitiy.Posts;
import com.qigatask1.qigaTask1.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    private ArrayList<Posts> getAll(){
        return postService.getAllPost();
    }

    @GetMapping("/{postId}")
    private Posts newPost(@PathVariable("postId") String postId){
        return postService.getPost(postId);
    }

    @PostMapping("/new")
    private Posts newPost(@RequestBody Posts post){
        return postService.newPost(post);
    }
}
