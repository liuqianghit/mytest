package com.lq.test.vo;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
public class Student {
    private String username;
    private String password;
    private String name;

    public Student(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Student() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
