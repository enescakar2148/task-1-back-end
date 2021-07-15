package com.qigatask1.qigaTask1.Entitiy;

import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity(name="Stories")
public class Stories {
    @Id
    @GeneratedValue //otomatik olarak atanacağını belirtir
    private int id;

    @NotNull
    private String userName;
    private String userId;
    private Timestamp timestamp;
    private String storyImageURL;
    private int storyId;

    public Stories() {
    }

    public Stories(int id, String userName, String userId,  int storyId, Timestamp timestamp, String storyImageURL) {
        this.id = id;
        this.userId = userId;
        this.storyId = storyId;
        this.userName = userName;
        this.timestamp = timestamp;
        this.storyImageURL = storyImageURL;
    }

    public int getId() {
        return id;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getStoryImageURL() {
        return storyImageURL;
    }

    public void setStoryImageURL(String storyImageURL) {
        this.storyImageURL = storyImageURL;
    }
}
