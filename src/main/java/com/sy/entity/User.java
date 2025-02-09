package com.sy.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;

    // // 生成getter和setter方法
    // public Integer getId() {
    //     return id;
    // }
    //
    // public void setId(Integer id) {
    //     this.id = id;
    // }
    //
    // public String getName() {
    //     return name;
    // }
    //
    // public void setName(String name) {
    //     this.name = name;
    // }
    //
    // public Integer getAge() {
    //     return age;
    // }
    //
    // public void setAge(Integer age) {
    //     this.age = age;
    // }
    //
    // // 重写toString方法
    // @Override
    // public String toString() {
    //     return "User{" +
    //             "id=" + id +
    //             ", name='" + name + '\'' +
    //             ", age=" + age +
    //             '}';
    // }
}