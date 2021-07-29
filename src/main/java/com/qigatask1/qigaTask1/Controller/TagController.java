package com.qigatask1.qigaTask1.Controller;


import com.qigatask1.qigaTask1.Entitiy.Tags;
import com.qigatask1.qigaTask1.Entitiy.Users;
import com.qigatask1.qigaTask1.Service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tags")
@CrossOrigin(origins = "http://localhost:3000")
public class TagController {


    @Autowired
    private TagService tagService;

    @PostMapping("/save")
    private Tags addUserToTags(@RequestBody Tags user) {
        return tagService.addUserToTags(user);
    }

    @GetMapping("")
    private List<Tags> getAllUserToTags() {
        return tagService.getAllTagsUser();
    }

    @GetMapping("/get/{userId}")
    private Tags getUser(@PathVariable (name = "userId") String userId) {
        return tagService.getTagUser(userId);
    }
}
