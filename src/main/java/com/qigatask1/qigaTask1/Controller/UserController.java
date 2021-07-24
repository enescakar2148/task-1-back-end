package com.qigatask1.qigaTask1.Controller;

import com.qigatask1.qigaTask1.Entitiy.Users;
import com.qigatask1.qigaTask1.Repository.UserRepo;
import com.qigatask1.qigaTask1.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    private void login(Users user) {
        System.out.println("login");
    }

    @PostMapping("/register")
    private Users newUser(@RequestBody Users user) {
        return userService.newUser(user);
    }

    @GetMapping("/user/{userId}")
    private Users getByUserId(@PathVariable(name = "userId") String userId) {
       return userService.getUserByUserId(userId);
    }

    @GetMapping("/users")
    private List<Users> getAllUsers() {
        return userService.getAllUsers();
    }
}
