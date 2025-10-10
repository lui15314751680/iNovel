package com.example.zjsu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String Page(Model model) {
        try {
            model.addAttribute("pageTitle", "书海阁 - 在线小说阅读平台");
            // 避免在此处添加可能抛出异常的代码
            return "index"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/index")
    public String indexPage(Model model) {
        try {
            model.addAttribute("pageTitle", "书海阁 - 在线小说阅读平台");
            // 避免在此处添加可能抛出异常的代码
            return "index"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/category")
    public String categoryPage(Model model) {
        try {
            model.addAttribute("pageTitle", "分类浏览 - 书海阁");
            // 避免在此处添加可能抛出异常的代码
            return "category"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/author-center")
    public String authorcenterPage(Model model) {
        try {
            model.addAttribute("pageTitle", "作者中心 - 书海阁");
            // 避免在此处添加可能抛出异常的代码
            return "author-center"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/user-center")
    public String usercenterPage(Model model) {
        try {
            model.addAttribute("pageTitle", "诡秘之主 - 书海阁");
            // 避免在此处添加可能抛出异常的代码
            return "user-center"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/book-detail")
    public String bookdetailPage(Model model) {
        try {
            model.addAttribute("pageTitle", "诡秘之主 - 书海阁");
            // 避免在此处添加可能抛出异常的代码
            return "book-detail"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/read")
    public String readPage(Model model) {
        try {
            model.addAttribute("pageTitle", "诡秘之主 - 书海阁");
            // 避免在此处添加可能抛出异常的代码
            return "read"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/log")
    public String logPage(Model model) {
        try {
            model.addAttribute("pageTitle", "登陆注册 - 书海阁");
            // 避免在此处添加可能抛出异常的代码
            return "log"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }

    @GetMapping("/forgetPW")
    public String forgetPWPage(Model model) {
        try {
            model.addAttribute("pageTitle", "登陆注册 - 书海阁");
            // 避免在此处添加可能抛出异常的代码
            return "forgetPW"; // 确保返回的视图名与模板文件名一致
        } catch (Exception e) {
            // 打印异常信息便于排查
            e.printStackTrace();
            throw e; // 重新抛出异常，让Spring捕获并记录
        }
    }
}
