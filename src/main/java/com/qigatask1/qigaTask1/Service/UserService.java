package com.qigatask1.qigaTask1.Service;

import com.qigatask1.qigaTask1.Entitiy.Users;
import com.qigatask1.qigaTask1.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public Users newUser(Users user) {
        return userRepo.save(user);
    }
}
