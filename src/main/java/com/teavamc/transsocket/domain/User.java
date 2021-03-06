package com.teavamc.transsocket.domain;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName User
 * @date 2019/4/29 21:36
 **/
public class User {
    private Integer id;
    private String username;
    private String nickname;
    private String gender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
