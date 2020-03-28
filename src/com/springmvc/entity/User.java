package com.springmvc.entity;


/**
 * 用户实体类
 */
public class User {
    private String username;
    private Integer age;
    private UserOther userOther;

    // 构造方法初始化参数
    public User(){}
    public User(String username, Integer age, UserOther userOther){
        this.username = username;
        this.age = age;
        this.userOther = userOther;
    }

    // 重写toString()方法
    public String toString(){
        return "用户信息: 用户名: " + username + "。年龄: " + age + "其他信息: " + userOther;
    }

    // getter()和setter()方法

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserOther getUserOther() {
        return userOther;
    }

    public void setUserOther(UserOther userOther) {
        this.userOther = userOther;
    }
}
