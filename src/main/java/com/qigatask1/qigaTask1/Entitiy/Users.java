package com.qigatask1.qigaTask1.Entitiy;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "Users")
public class Users {
    @Id
    @GeneratedValue
    private int id;


    @NotNull
    private String userId;
    private String userName;
    private String ppURL;


    public Users() {
        this.userId = UUID.randomUUID().toString();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPpURL() {
        return ppURL;
    }

    public void setPpURL(String ppURL) {
        this.ppURL = ppURL;
    }
}
