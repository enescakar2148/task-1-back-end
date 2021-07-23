package com.qigatask1.qigaTask1.Entitiy;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.UUID;

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
    private String storyId;
    private String ppImageURL;

    public String getPpImageURL() {
        return ppImageURL;
    }

    public void setPpImageURL(String ppImageURL) {
        this.ppImageURL = ppImageURL;
    }

    public Stories() {
        this.storyId = UUID.randomUUID().toString();
    }

    public int getId() {
        return id;
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

    public String getStoryId() {
        return storyId;
    }

    public void setStoryId(String storyId) {
        this.storyId = storyId;
    }
}