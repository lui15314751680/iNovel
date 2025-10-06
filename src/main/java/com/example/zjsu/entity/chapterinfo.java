package com.example.zjsu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "chapters")
public class chapterinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    @Column(nullable = false)
    private Integer eid;

    @Column(name = "cnum", nullable = false)
    private Integer cnum;

    @Column(name = "ctitle")
    private String ctitle;

    @Column(name = "content", nullable = false, columnDefinition = "LONGTEXT")
    private String content;

    public chapterinfo() {
    }

    public chapterinfo(Integer cid, Integer eid, Integer cnum, String ctite, String content) {
        this.cid = cid;
        this.eid = eid;
        this.cnum = cnum;
        this.ctitle = ctite;
        this.content = content;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getCnum() {
        return cnum;
    }

    public void setCnum(Integer cnum) {
        this.cnum = cnum;
    }

    public String getCtite() {
        return ctitle;
    }

    public void setCtite(String ctite) {
        this.ctitle = ctite;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
