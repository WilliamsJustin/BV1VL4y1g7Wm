package com.itheima.entity;

public class Student {
    //学生id
    private Integer id;
    //学生姓名
    private String username;
    //学生密码
    private String password;
    //学生科目
    private String course;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", 姓名='" + username + '\'' +
                ", 密码='" + password + '\'' +
                ", 科目='" + course + '\'' +
                '}';
    }
}

