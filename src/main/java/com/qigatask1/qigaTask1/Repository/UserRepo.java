package com.qigatask1.qigaTask1.Repository;

import com.qigatask1.qigaTask1.Entitiy.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
    Users save(Users user);
    Users getByUserId(String userId);
    List<Users> findAll();
}
