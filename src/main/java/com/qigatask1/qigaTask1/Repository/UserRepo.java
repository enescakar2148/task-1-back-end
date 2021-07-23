package com.qigatask1.qigaTask1.Repository;

import com.qigatask1.qigaTask1.Entitiy.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer> {
    Users save(Users user);
}
