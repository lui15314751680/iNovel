package com.example.zjsu.controller;

import com.example.zjsu.entity.userinfo;
import com.example.zjsu.repository.userinfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {
    @Autowired
    private userinfoRepository userRepository;

    @GetMapping("/users")
    @ResponseBody
    public String showALL(Model model) {
        List<userinfo> userList = userRepository.findAll();

        model.addAttribute("users", userList);

        return "userList";
    }
}
