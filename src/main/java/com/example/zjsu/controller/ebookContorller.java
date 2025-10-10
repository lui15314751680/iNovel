package com.example.zjsu.controller;

import com.example.zjsu.entity.ebookinfo;
import com.example.zjsu.repository.ebookinfoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ebookContorller {

    @Autowired
    private ebookinfoRespository ebookRespository;

    @GetMapping("/ebook/getall")
    @ResponseBody
    public String showALL(Model model) {
        List<ebookinfo> ebookList = ebookRespository.findAll();

        model.addAttribute("ebooks", ebookList);

        return "ebookList";
    }

    @GetMapping("/ebook")
    @ResponseBody
    public String showEpic(@RequestParam("name") String name) {
        ebookinfo book = ebookRespository.findByEname(name);
        if (book != null) {
            return book.getEpic();
        } else {
            return "unknown";
        }
    }

    @GetMapping("/ebook/EpicByname")
    @ResponseBody
    public String EpicByname(@RequestParam("name") String name) {
        ebookinfo book = ebookRespository.findByEname(name);
        return book.getEpic();
    }

    @GetMapping("/ebook/eidByName")
    @ResponseBody
    public Integer eidByName(@RequestParam("name") String name) {
        ebookinfo book = ebookRespository.findByEname(name);
        return book.getEid();
    }
}
