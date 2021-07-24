package com.qigatask1.qigaTask1.Service;

import com.qigatask1.qigaTask1.Entitiy.Users;
import com.qigatask1.qigaTask1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Users newUser(Users user) {
        return userRepo.save(user);
    }
    public Users getUserByUserId(String userId) {
        return userRepo.getByUserId(userId);
    }
    public List<Users> getAllUsers(){
        return userRepo.findAll();
    }
}
