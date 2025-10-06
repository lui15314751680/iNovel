package com.example.zjsu.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name = "ebookinfo")
public class ebookinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eid;
    private String ename;
    private String epic;
    private String etype;
    private String etext;

    public ebookinfo() {
    }

    public ebookinfo(Integer eid, String ename, String epic, String etype, String etext) {
        this.eid = eid;
        this.ename = ename;
        this.epic = epic;
        this.etype = etype;
        this.etext = etext;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEpic() {
        return epic;
    }

    public void setEpic(String epic) {
        this.epic = epic;
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public String getEtext() {
        return etext;
    }

    public void setEtext(String etext) {
        this.etext = etext;
    }
}
