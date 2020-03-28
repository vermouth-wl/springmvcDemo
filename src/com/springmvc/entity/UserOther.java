package com.springmvc.entity;

/**
 * 地址实体类
 */
public class UserOther {
    private String address;
    private String phone;

    // 构造方法,初始化参数
    public UserOther(){}
    public UserOther(String address, String phone){
        this.address = address;
        this.phone = phone;
    }

    // 重写toString()方法
    public String toString(){
        return "用户其他信息: 家庭住址: " + address + "。联系电话: " + phone;
    }

    // getter()方法和setter()方法

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
