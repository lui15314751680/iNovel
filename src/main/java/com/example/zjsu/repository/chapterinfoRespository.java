package com.example.zjsu.repository;

import com.example.zjsu.entity.chapterinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface chapterinfoRespository  extends JpaRepository<chapterinfo, Integer> {
    chapterinfo findByCtitle(String ctitle);
    chapterinfo findByCid(Integer cid);
    chapterinfo findByCnum(Integer cnum);
    chapterinfo findByEidAndCnum(Integer eid,Integer cnum);
}
