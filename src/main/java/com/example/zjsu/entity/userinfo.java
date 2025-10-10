package com.example.zjsu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "userinfo")
public class userinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 自增主键
    private Integer uid;
    private String upic;
    private String uname;
    private String upassword;

    public userinfo() {
    }

    public userinfo(Integer uid, String upic, String uname, String upassword) {
        this.uid = uid;
        this.upic = upic;
        this.uname = uname;
        this.upassword = upassword;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUpic() {
        return upic;
    }

    public void setUpic(String upic) {
        this.upic = upic;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
