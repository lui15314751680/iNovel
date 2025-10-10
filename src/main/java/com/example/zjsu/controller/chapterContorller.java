package com.example.zjsu.controller;

import com.example.zjsu.entity.chapterinfo;
import com.example.zjsu.entity.ebookinfo;
import com.example.zjsu.entity.userinfo;
import com.example.zjsu.repository.chapterinfoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class chapterContorller {
    @Autowired
    private chapterinfoRespository chapterRespository;

    @GetMapping("/chapter/content")
    @ResponseBody
    public String contentByCtitle(@RequestParam("ctitle") String ctitle) {
        chapterinfo chapter = chapterRespository.findByCtitle(ctitle);
        if (chapter != null) {
            return chapter.getContent();
        } else {
            return "unknown";
        }
    }

    @GetMapping("/chapter/contentByEidAndCnum")
    @ResponseBody
    public String contentByEidAndCnum(@RequestParam("eid") Integer eid, @RequestParam("cnum") Integer cnum) {
        chapterinfo chapter = chapterRespository.findByEidAndCnum(eid, cnum);
        if (chapter != null) {
            return chapter.getContent();
        } else {
            return "unknown";
        }
    }
}
