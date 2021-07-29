package com.qigatask1.qigaTask1.Repository;

import com.qigatask1.qigaTask1.Entitiy.Tags;
import com.qigatask1.qigaTask1.Entitiy.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TagRepo extends CrudRepository<Tags, Integer> {
    Tags save(Tags user);
    Tags getByUserId(String userId);
    List<Tags> findAll();
}
