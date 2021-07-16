package com.qigatask1.qigaTask1.Controller;

import com.qigatask1.qigaTask1.Entitiy.Stories;
import com.qigatask1.qigaTask1.Service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/stories") //domainde gelen isteklerden /stories query'sine cevap verir
//örnek: https://localhost:8080/api/stories
public class StoryController {

    @Autowired
    private StoryService storyService;

    @GetMapping("")
    private ArrayList<Stories> getAll(){
        //Tüm Hikayeleri Liste İçinde Getirir
        return storyService.getAllStories();
    }

    @GetMapping("/{storyId}")
    private Stories getStory(@PathVariable("storyId") String storyId){
        //bir kullanıcıya ait storyi getirir
        return storyService.displayStoriesForUser(storyId);
    }

    @PostMapping("/new")
    private Stories newStory(@RequestBody Stories stories){
        //Yeni hikaye yükler
        return storyService.uploadStory(stories);
    }
}
