package com.shop.store.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 类名:
 * 概要: 用户信息实体类
 *
 * @author xzz
 * @version 1.00 (2019年02月21日)
 */

@Entity
@Table(name = "user_base")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private Integer usersex;

    @Column(nullable = true)
    private String nickname;

    @Column(nullable = true)
    private String userimg;

    public User(String user_name, String pass_word, Integer user_sex, String nick_name, String userimg) {
        this.username = user_name;
        this.password = pass_word;
        this.usersex = user_sex;
        this.nickname = nick_name;
        this.userimg = userimg;
    }

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + username + '\'' +
                ", pass_word='" + password + '\'' +
                ", user_sex=" + usersex +
                ", nick_name='" + nickname + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }
}
